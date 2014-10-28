package com.polyfx.jssembly;

import java.util.HashMap;

public class Jssembly {
	static {
		// Jssembly.x86.dll (Windows) or libJssembly.arm64.so (*NIX)
		// TODO: probably needs some tweaking and architecture consolidation
		System.loadLibrary("Jssembly."+System.getProperty("os.arch"));
	}
	
	protected static native void invoke(byte[] binary, Object... args);
	
	// good stuff stored here
	private HashMap<String, Block> executables = new HashMap<String, Block>();
	
	public Block define(String name, byte[] assembly) {
		Block blok = new Block(assembly);
		this.executables.put(name, blok);
		return blok;
	}
	
	public Block define(String name, Block blok) {       
		this.executables.put(name, blok);
		return blok;
	}
	
	public Block get(String name) {
		return this.executables.get(name);
	}
}
