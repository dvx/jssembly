package com.polyfx.jssembly.platforms.x64;

public class x64OpcodeMapping {
	public static final Object[][] map = new Object[][] {
			{ "ret",   0xC3 },
			{ "iret",  0xCF },
			{ "iretd", 0xCF },
			{ "iretq", 0xCF },
			{ "nop"  , 0x90 },
	};
}
