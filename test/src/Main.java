import java.io.IOException;

import static com.polyfx.jssembly.platforms.Architecture.*;
import com.polyfx.jssembly.Block;
import com.polyfx.jssembly.Jssembly;

public class Main {
	public static void main(String[] args) throws IOException {
		Jssembly jsm = new Jssembly();
				
		jsm.define("test1", new Block(raw) {{
			__asm(
				0x31, 0xC0, 0x48, 0xFF, 0xC0,
				0xB9, 0x01, 0x00, 0x00, 0x00,		// mov 1, rax
				0xC7, 0xC0, 0x03, 0x00, 0x00, 0x00, // mov 3, rax
				0xC3								// ret
			);
		}}).invoke(); // should return 3 as an integer
	
		jsm.define("test2", new Block(x64) {{
			__asm("nop");		// no-op
			__asm("ret");		// return
		}});
		
		jsm.define("test3", new Block(x64) {{
			__asm(
				"nop",			// no-op
				"ret"			// return
			);
		}});
		
		//jsm.get("test2").invoke();
	}
}