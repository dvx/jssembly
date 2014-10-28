package com.polyfx.jssembly;

import java.nio.ByteBuffer;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;

import static com.polyfx.jssembly.platforms.Architecture.*;

import com.polyfx.jssembly.platforms.Architecture;
import com.polyfx.jssembly.platforms.Assembler;
import com.polyfx.jssembly.platforms.x64.x64Assembler;
import com.polyfx.jssembly.platforms.x64.x64Lexer;

public class Block {
	private Architecture architecture;
	private byte[] instructions;
	private String program = "";
	
	public Block(byte[] instr) {
		this.instructions = instr;
		this.architecture = raw;
	}

	public Block(Architecture arch) {
		this.architecture = arch;
		Lexer lex = null;
		Assembler assembler = null;
		
		switch (architecture) {
			// no parsing necessary if we're writing bytes to memory
			case raw:
				return;
			// arm architectures trickle down
			case armv7:
			case armv9:
				// lex = new armLexer(new ANTLRStringStream(program));
				// assembler = new armAssembler(new CommonTokenStream(lex));
				break;
			case x64:
				lex = new x64Lexer(new ANTLRStringStream(program));
				assembler = new x64Assembler(new CommonTokenStream(lex));
				break;
			case x86:
				break;
			default:
				break;
		}
		
		try {
			if (assembler != null) {
				assembler.start();
				this.instructions = assembler.getMachineCode();
			} else {
				throw new JssemblyException("Assembler not found for architecture: " + this.architecture.name());
			}
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Direct bytes go directly in the buffer (and to memory via the JNI bridge)
	 * 
	 * NOTE: we use ints here otherwise we need to do annoying casting in the caller
	 */
	public void __asm(int ... bytes) {
		ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
		for (int i : bytes) {
			byteBuffer.put((byte) i);
		}
		this.instructions = byteBuffer.array();
	}

	/*
	 * One line at a time
	 */
	public void __asm(String line) {
		this.program += (line + '\n');
	}

	/*
	 * Multiple lines
	 */
	public void __asm(String... lines) {
		for (String line : lines) {
			this.__asm(line);
		}

	}

	/*
	 * 
	 */
	public String getProgram() {
		return this.program;
	}
	
	/*
	 * 
	 */
	public void invoke(Object... args) {
		Jssembly.invoke(this.instructions, args);
	}
}
