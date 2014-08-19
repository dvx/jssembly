package com.polyfx.jssembly;

import java.util.HashMap;

public class Jssembly {
	static {
	   System.loadLibrary("Jssembly."+System.getProperty("os.arch")); // Jssembly.dll (Windows) or libJssembly.so (*NIX)
	   }
	
	protected static native void invoke(byte[] binary, Object... args);
	
	private HashMap<String, Block> executables = new HashMap<String, Block>();
	
	public Block define(String name, byte[] assembly) {
		Block blok = new Block(assembly);
		executables.put(name, blok);
		return blok;
	}
	
	public Block define(String name, Block blok) {       
		executables.put(name, blok);
		return blok;
	}
	
	public Block get(String name) {
		return executables.get(name);
	}
}
