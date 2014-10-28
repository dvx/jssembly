package com.polyfx.jssembly.platforms.x64;

import org.antlr.runtime.*;

import com.polyfx.jssembly.platforms.Assembler;

import java.io.ByteArrayOutputStream;
import java.util.Hashtable;

public class x64Assembler extends x64Parser implements Assembler {
	protected Hashtable<String, Integer> instructionOpcodeMapping = new Hashtable<String, Integer>();
	protected ByteArrayOutputStream codeStream = new ByteArrayOutputStream();

	/**
	 * Create an assembler, inject the lexer and define the instruction set
	 */
	public x64Assembler(TokenStream lexer) {
		super(lexer);
		Object[][] instructions = x64OpcodeMapping.map;
		for (int i = 0; i < instructions.length; i++) {
			/* mapping looks like [ (mnemonic, opcode)
			 *                      (mnemonic, opcode) ]
			 *                              ...
			 */
			this.instructionOpcodeMapping.put(((String) instructions[i][0]).toLowerCase(), new Integer((Integer) instructions[i][1]));
		}
	}

	/** 
	 * Get machine code (raw bytes)
	 */
	public byte[] getMachineCode() {
		return this.codeStream.toByteArray();
	}

	/**
	 * Generate code for a nullary instruction
	 * INSTR
	 * 
	 * ex: ret, nop
	 */
	protected void instruction(String instrToken) {
		this.codeStream.write((Integer) instructionOpcodeMapping.get(instrToken));
	}
	
	/**
	 * Generate code for a unary instruction
	 * INSTR OP1
	 * 
	 * ex: inc
	 */
	protected void instruction(String instrToken, int x) {
		// TODO: implementation
	}
	
	/**
	 * Generate code for a binary instruction
	 * INSTR OP1 OP2
	 * 
	 * ex: mov, push
	 */
	protected void instruction(String instrToken, int x, int y) {
		// TODO: implementation
	}	
	
}