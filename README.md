jssembly
========

Jssembly is a library that allows you to execute native assembly from Java via a JNI bridge. The goal is to provide wrappers and parsers for Windows/*NIX/OSX/Android. Most of the work currently consists of writing ANTLR parsers for

  - x86 assembly
  - amd64 assembly
  - ARMv7/v8 assembly

However, with great power comes great responsibility.
 
> **WARNING:** Jssembly can (and will) crash your VM if you don't know what you're doing. The current pre-alpha state is in no way meant to be used in production code. You have been warned.

Usage
----

**Jssembly** emulates ```__asm``` syntax found in Visual Studio or GCC in Java. Currently, a few proofs of concept work on Android and Windows x64 systems. x84 and *NIX support is currently in development.

``` java
Jssembly jsm = new Jssembly();
```
###Blocks
Jssembly uses  executable code "blocks" as its primary invokable piece of native code. There are two types of blocks: **raw** and **assembly**. Raw blocks contain opcodes whereas assembly blocks contain (you guessed it) platform-specific assembly. For example, here is a raw block called ```test1```:

``` java
jsm.define("test1", new Block(raw) {{
	__asm(
		0x31, 0xC0, 0x48, 0xFF, 0xC0 ... 0xC3
	);
}});
```

And here is an ```x64``` assembly block called ```test2```:
``` java
jsm.define("test2", new Block(x64) {{
	__asm("nop");
	__asm("mov rax, rdi")
	__asm("ret");
}});
```

We invoke ```test1``` by calling ```jsm.get("test1").invoke(argument1, argument2 ... argN)``` or we can invoke a block in-place like so:
``` java
jsm.define("test3", new Block(x64) {{
	__asm(
		"nop",  // no-op
		"ret"   // return
	);
}}).invoke();
```
Here we see yet another flavor of the ```___asm``` syntax. Note that the parser is called when the ```Block``` constructor is called. In case of a syntax error, we should see an exception when a new definition occurs.

###Arguments
We can also pass a variable number of arguments to the ```invoke()``` method. These arguments can be accessed through platform-specific assembly.

###Return types
In the works, although ```invoke()``` currently returns void.

###Invocation woes
Great care must be taken with raw blocks as no viable run-time checks can be done on them. Make *sure* that the right raw code is executed on the right platform -- otherwise, the VM will crash. Naive checks are in the works for assembly blocks.

License
----

MIT.
