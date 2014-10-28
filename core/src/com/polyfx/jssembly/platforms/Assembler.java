package com.polyfx.jssembly.platforms;

import org.antlr.runtime.RecognitionException;

public interface Assembler {

	Object start() throws RecognitionException;
	byte[] getMachineCode();
	
}
