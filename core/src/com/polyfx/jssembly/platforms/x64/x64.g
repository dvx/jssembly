grammar x64;

options {
  language = Java;
  output=AST;
}

tokens {
  INSTRUCTION;  
  MNEMONIC;
  
  REG8;
  REG16;
  REG32;
  REG64;
  
  I8;
  I16;
  I32;
  I64;
  
  MEM8;
  MEM16;
  MEM32;
  MEM64;
}

@lexer::header {
    package com.polyfx.jssembly.platforms.x64;
}

@parser::header {
    package com.polyfx.jssembly.platforms.x64;
}

@parser::members {
    protected void instruction(String token) {;}                    // nullary
    protected void instruction(String token, int op1) {;}           // unary
    protected void instruction(String token, int op1, int op2) {;}  // binary
    // ...
}

start
  : assembly? EOF
  ;
  
assembly 
  : (instruction NL?)+
  ;
  
instruction
  : nullary_instruction -> ^(INSTRUCTION nullary_instruction)
  | unary_instruction -> ^(INSTRUCTION unary_instruction)
  ;
 
nullary_instruction
  : o = nullary_opcode { instruction($o.text); }
  ;
  
unary_instruction
  : unary_opcode
  ;
  
nullary_opcode
  : 'ret'   -> MNEMONIC["ret"]
  | 'iret'  -> MNEMONIC["iret"]
  | 'iretd' -> MNEMONIC["iretd"]
  | 'iretq' -> MNEMONIC["iretq"]
  | 'nop'   -> MNEMONIC["nop"]
  ;

unary_opcode
  : 'inc' -> MNEMONIC["inc"]
  ;
  
NL
  : '\n' {$channel=HIDDEN;}
  ;

WS
  : (' ')+ {$channel=HIDDEN;} // ignore whitespace
  ;

HEX_DIGIT
  : '0' .. '9' | 'a' .. 'f' | 'A' .. 'F'
  ;
  
reg8
  : 'al' -> REG8["al"]
  | 'ah' -> REG8["ah"]
  | 'bl' -> REG8["bl"]
  | 'bh' -> REG8["bh"]
  | 'cl' -> REG8["cl"]
  | 'ch' -> REG8["ch"]
  | 'dl' -> REG8["dl"]
  | 'dh' -> REG8["dh"]
  ;

reg16 
  : 'ax' -> REG16["ax"]
  | 'bx' -> REG16["bx"]
  | 'cx' -> REG16["cx"]
  | 'dx' -> REG16["dx"]
  | 'si' -> REG16["si"]
  | 'di' -> REG16["di"]
  | 'sp' -> REG16["sp"]
  | 'bp' -> REG16["bp"]
  ;

reg32 
  : 'eax' -> REG32["eax"]
  | 'ebx' -> REG32["ebx"]
  | 'ecx' -> REG32["ecx"]
  | 'edx' -> REG32["edx"]
  | 'esi' -> REG32["esi"]
  | 'edi' -> REG32["edi"]
  | 'esp' -> REG32["esp"]
  | 'ebp' -> REG32["ebp"]
  ;
  
reg64 
  : 'rax' -> REG32["rax"]
  | 'rbx' -> REG32["rbx"]
  | 'rcx' -> REG32["rcx"]
  | 'rdx' -> REG32["rdx"]
  | 'rsi' -> REG32["rsi"]
  | 'rdi' -> REG32["rdi"]
  | 'rsp' -> REG32["rsp"]
  | 'rbp' -> REG32["rbp"]
  | 'r8'  -> REG32["r8" ]
  | 'r9'  -> REG32["r9" ]
  | 'r10' -> REG32["r10"]
  | 'r11' -> REG32["r11"]
  | 'r12' -> REG32["r12"]
  | 'r13' -> REG32["r13"]
  | 'r14' -> REG32["r14"]
  | 'r15' -> REG32["r15"]
  ;