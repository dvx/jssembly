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
			instructionOpcodeMapping.put(((String) instructions[i][0]).toLowerCase(), new Integer((Integer) instructions[i][1]));
		}
	}

	/** copy out the instruction memory */
	public byte[] getMachineCode() {
		return codeStream.toByteArray();
	}

	/** Generate code for an instruction with no operands */
	protected void instruction(String instrToken) {
		codeStream.write((Integer) instructionOpcodeMapping.get(instrToken));
	}
	
	/** Generate code for an instruction with one operand */
	protected void instruction(String instrToken, int x) {
		// TODO: implementation
	}	
	
}