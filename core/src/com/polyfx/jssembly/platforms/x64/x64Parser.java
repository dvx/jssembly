// $ANTLR 3.5.2 F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g 2014-08-19 13:06:12

    package com.polyfx.jssembly.platforms.x64;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class x64Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "HEX_DIGIT", "I16", "I32", "I64", 
		"I8", "INSTRUCTION", "MEM16", "MEM32", "MEM64", "MEM8", "MNEMONIC", "NL", 
		"REG16", "REG32", "REG64", "REG8", "WS", "'ah'", "'al'", "'ax'", "'bh'", 
		"'bl'", "'bp'", "'bx'", "'ch'", "'cl'", "'cx'", "'dh'", "'di'", "'dl'", 
		"'dx'", "'eax'", "'ebp'", "'ebx'", "'ecx'", "'edi'", "'edx'", "'esi'", 
		"'esp'", "'inc'", "'iret'", "'iretd'", "'iretq'", "'nop'", "'r10'", "'r11'", 
		"'r12'", "'r13'", "'r14'", "'r15'", "'r8'", "'r9'", "'rax'", "'rbp'", 
		"'rbx'", "'rcx'", "'rdi'", "'rdx'", "'ret'", "'rsi'", "'rsp'", "'si'", 
		"'sp'"
	};
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int HEX_DIGIT=4;
	public static final int I16=5;
	public static final int I32=6;
	public static final int I64=7;
	public static final int I8=8;
	public static final int INSTRUCTION=9;
	public static final int MEM16=10;
	public static final int MEM32=11;
	public static final int MEM64=12;
	public static final int MEM8=13;
	public static final int MNEMONIC=14;
	public static final int NL=15;
	public static final int REG16=16;
	public static final int REG32=17;
	public static final int REG64=18;
	public static final int REG8=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public x64Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public x64Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return x64Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g"; }


	    protected void instruction(String token) {;}                    // nullary
	    protected void instruction(String token, int op1) {;}           // unary
	    protected void instruction(String token, int op1, int op2) {;}  // binary
	    // ...


	public static class start_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:43:1: start : ( assembly )? EOF ;
	public final x64Parser.start_return start() throws RecognitionException {
		x64Parser.start_return retval = new x64Parser.start_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope assembly1 =null;

		Object EOF2_tree=null;

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:44:3: ( ( assembly )? EOF )
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:44:5: ( assembly )? EOF
			{
			root_0 = (Object)adaptor.nil();


			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:44:5: ( assembly )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= 43 && LA1_0 <= 47)||LA1_0==62) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:44:5: assembly
					{
					pushFollow(FOLLOW_assembly_in_start146);
					assembly1=assembly();
					state._fsp--;

					adaptor.addChild(root_0, assembly1.getTree());

					}
					break;

			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start149); 
			EOF2_tree = (Object)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start"


	public static class assembly_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assembly"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:47:1: assembly : ( instruction ( NL )? )+ ;
	public final x64Parser.assembly_return assembly() throws RecognitionException {
		x64Parser.assembly_return retval = new x64Parser.assembly_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NL4=null;
		ParserRuleReturnScope instruction3 =null;

		Object NL4_tree=null;

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:48:3: ( ( instruction ( NL )? )+ )
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:48:5: ( instruction ( NL )? )+
			{
			root_0 = (Object)adaptor.nil();


			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:48:5: ( instruction ( NL )? )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 43 && LA3_0 <= 47)||LA3_0==62) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:48:6: instruction ( NL )?
					{
					pushFollow(FOLLOW_instruction_in_assembly166);
					instruction3=instruction();
					state._fsp--;

					adaptor.addChild(root_0, instruction3.getTree());

					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:48:18: ( NL )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==NL) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:48:18: NL
							{
							NL4=(Token)match(input,NL,FOLLOW_NL_in_assembly168); 
							NL4_tree = (Object)adaptor.create(NL4);
							adaptor.addChild(root_0, NL4_tree);

							}
							break;

					}

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assembly"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:51:1: instruction : ( nullary_instruction -> ^( INSTRUCTION nullary_instruction ) | unary_instruction -> ^( INSTRUCTION unary_instruction ) );
	public final x64Parser.instruction_return instruction() throws RecognitionException {
		x64Parser.instruction_return retval = new x64Parser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nullary_instruction5 =null;
		ParserRuleReturnScope unary_instruction6 =null;

		RewriteRuleSubtreeStream stream_nullary_instruction=new RewriteRuleSubtreeStream(adaptor,"rule nullary_instruction");
		RewriteRuleSubtreeStream stream_unary_instruction=new RewriteRuleSubtreeStream(adaptor,"rule unary_instruction");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:52:3: ( nullary_instruction -> ^( INSTRUCTION nullary_instruction ) | unary_instruction -> ^( INSTRUCTION unary_instruction ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= 44 && LA4_0 <= 47)||LA4_0==62) ) {
				alt4=1;
			}
			else if ( (LA4_0==43) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:52:5: nullary_instruction
					{
					pushFollow(FOLLOW_nullary_instruction_in_instruction186);
					nullary_instruction5=nullary_instruction();
					state._fsp--;

					stream_nullary_instruction.add(nullary_instruction5.getTree());
					// AST REWRITE
					// elements: nullary_instruction
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 52:25: -> ^( INSTRUCTION nullary_instruction )
					{
						// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:52:28: ^( INSTRUCTION nullary_instruction )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_1);
						adaptor.addChild(root_1, stream_nullary_instruction.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:53:5: unary_instruction
					{
					pushFollow(FOLLOW_unary_instruction_in_instruction200);
					unary_instruction6=unary_instruction();
					state._fsp--;

					stream_unary_instruction.add(unary_instruction6.getTree());
					// AST REWRITE
					// elements: unary_instruction
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 53:23: -> ^( INSTRUCTION unary_instruction )
					{
						// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:53:26: ^( INSTRUCTION unary_instruction )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_1);
						adaptor.addChild(root_1, stream_unary_instruction.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class nullary_instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nullary_instruction"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:56:1: nullary_instruction : o= nullary_opcode ;
	public final x64Parser.nullary_instruction_return nullary_instruction() throws RecognitionException {
		x64Parser.nullary_instruction_return retval = new x64Parser.nullary_instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope o =null;


		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:57:3: (o= nullary_opcode )
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:57:5: o= nullary_opcode
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_nullary_opcode_in_nullary_instruction226);
			o=nullary_opcode();
			state._fsp--;

			adaptor.addChild(root_0, o.getTree());

			 instruction((o!=null?input.toString(o.start,o.stop):null)); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nullary_instruction"


	public static class unary_instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_instruction"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:60:1: unary_instruction : unary_opcode ;
	public final x64Parser.unary_instruction_return unary_instruction() throws RecognitionException {
		x64Parser.unary_instruction_return retval = new x64Parser.unary_instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unary_opcode7 =null;


		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:61:3: ( unary_opcode )
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:61:5: unary_opcode
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_opcode_in_unary_instruction243);
			unary_opcode7=unary_opcode();
			state._fsp--;

			adaptor.addChild(root_0, unary_opcode7.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_instruction"


	public static class nullary_opcode_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nullary_opcode"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:64:1: nullary_opcode : ( 'ret' -> MNEMONIC[\"ret\"] | 'iret' -> MNEMONIC[\"iret\"] | 'iretd' -> MNEMONIC[\"iretd\"] | 'iretq' -> MNEMONIC[\"iretq\"] | 'nop' -> MNEMONIC[\"nop\"] );
	public final x64Parser.nullary_opcode_return nullary_opcode() throws RecognitionException {
		x64Parser.nullary_opcode_return retval = new x64Parser.nullary_opcode_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		Token string_literal9=null;
		Token string_literal10=null;
		Token string_literal11=null;
		Token string_literal12=null;

		Object string_literal8_tree=null;
		Object string_literal9_tree=null;
		Object string_literal10_tree=null;
		Object string_literal11_tree=null;
		Object string_literal12_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:65:3: ( 'ret' -> MNEMONIC[\"ret\"] | 'iret' -> MNEMONIC[\"iret\"] | 'iretd' -> MNEMONIC[\"iretd\"] | 'iretq' -> MNEMONIC[\"iretq\"] | 'nop' -> MNEMONIC[\"nop\"] )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 62:
				{
				alt5=1;
				}
				break;
			case 44:
				{
				alt5=2;
				}
				break;
			case 45:
				{
				alt5=3;
				}
				break;
			case 46:
				{
				alt5=4;
				}
				break;
			case 47:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:65:5: 'ret'
					{
					string_literal8=(Token)match(input,62,FOLLOW_62_in_nullary_opcode258);  
					stream_62.add(string_literal8);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:13: -> MNEMONIC[\"ret\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(MNEMONIC, "ret"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:66:5: 'iret'
					{
					string_literal9=(Token)match(input,44,FOLLOW_44_in_nullary_opcode271);  
					stream_44.add(string_literal9);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:13: -> MNEMONIC[\"iret\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(MNEMONIC, "iret"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:67:5: 'iretd'
					{
					string_literal10=(Token)match(input,45,FOLLOW_45_in_nullary_opcode283);  
					stream_45.add(string_literal10);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:13: -> MNEMONIC[\"iretd\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(MNEMONIC, "iretd"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:68:5: 'iretq'
					{
					string_literal11=(Token)match(input,46,FOLLOW_46_in_nullary_opcode294);  
					stream_46.add(string_literal11);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:13: -> MNEMONIC[\"iretq\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(MNEMONIC, "iretq"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:69:5: 'nop'
					{
					string_literal12=(Token)match(input,47,FOLLOW_47_in_nullary_opcode305);  
					stream_47.add(string_literal12);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:13: -> MNEMONIC[\"nop\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(MNEMONIC, "nop"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nullary_opcode"


	public static class unary_opcode_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_opcode"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:72:1: unary_opcode : 'inc' -> MNEMONIC[\"inc\"] ;
	public final x64Parser.unary_opcode_return unary_opcode() throws RecognitionException {
		x64Parser.unary_opcode_return retval = new x64Parser.unary_opcode_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal13=null;

		Object string_literal13_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:73:3: ( 'inc' -> MNEMONIC[\"inc\"] )
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:73:5: 'inc'
			{
			string_literal13=(Token)match(input,43,FOLLOW_43_in_unary_opcode325);  
			stream_43.add(string_literal13);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 73:11: -> MNEMONIC[\"inc\"]
			{
				adaptor.addChild(root_0, (Object)adaptor.create(MNEMONIC, "inc"));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_opcode"


	public static class reg8_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reg8"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:88:1: reg8 : ( 'al' -> REG8[\"al\"] | 'ah' -> REG8[\"ah\"] | 'bl' -> REG8[\"bl\"] | 'bh' -> REG8[\"bh\"] | 'cl' -> REG8[\"cl\"] | 'ch' -> REG8[\"ch\"] | 'dl' -> REG8[\"dl\"] | 'dh' -> REG8[\"dh\"] );
	public final x64Parser.reg8_return reg8() throws RecognitionException {
		x64Parser.reg8_return retval = new x64Parser.reg8_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;
		Token string_literal15=null;
		Token string_literal16=null;
		Token string_literal17=null;
		Token string_literal18=null;
		Token string_literal19=null;
		Token string_literal20=null;
		Token string_literal21=null;

		Object string_literal14_tree=null;
		Object string_literal15_tree=null;
		Object string_literal16_tree=null;
		Object string_literal17_tree=null;
		Object string_literal18_tree=null;
		Object string_literal19_tree=null;
		Object string_literal20_tree=null;
		Object string_literal21_tree=null;
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:89:3: ( 'al' -> REG8[\"al\"] | 'ah' -> REG8[\"ah\"] | 'bl' -> REG8[\"bl\"] | 'bh' -> REG8[\"bh\"] | 'cl' -> REG8[\"cl\"] | 'ch' -> REG8[\"ch\"] | 'dl' -> REG8[\"dl\"] | 'dh' -> REG8[\"dh\"] )
			int alt6=8;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt6=1;
				}
				break;
			case 21:
				{
				alt6=2;
				}
				break;
			case 25:
				{
				alt6=3;
				}
				break;
			case 24:
				{
				alt6=4;
				}
				break;
			case 29:
				{
				alt6=5;
				}
				break;
			case 28:
				{
				alt6=6;
				}
				break;
			case 33:
				{
				alt6=7;
				}
				break;
			case 31:
				{
				alt6=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:89:5: 'al'
					{
					string_literal14=(Token)match(input,22,FOLLOW_22_in_reg8414);  
					stream_22.add(string_literal14);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:10: -> REG8[\"al\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "al"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:90:5: 'ah'
					{
					string_literal15=(Token)match(input,21,FOLLOW_21_in_reg8425);  
					stream_21.add(string_literal15);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:10: -> REG8[\"ah\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "ah"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:91:5: 'bl'
					{
					string_literal16=(Token)match(input,25,FOLLOW_25_in_reg8436);  
					stream_25.add(string_literal16);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:10: -> REG8[\"bl\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "bl"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:92:5: 'bh'
					{
					string_literal17=(Token)match(input,24,FOLLOW_24_in_reg8447);  
					stream_24.add(string_literal17);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:10: -> REG8[\"bh\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "bh"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:93:5: 'cl'
					{
					string_literal18=(Token)match(input,29,FOLLOW_29_in_reg8458);  
					stream_29.add(string_literal18);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:10: -> REG8[\"cl\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "cl"));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:94:5: 'ch'
					{
					string_literal19=(Token)match(input,28,FOLLOW_28_in_reg8469);  
					stream_28.add(string_literal19);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:10: -> REG8[\"ch\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "ch"));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:95:5: 'dl'
					{
					string_literal20=(Token)match(input,33,FOLLOW_33_in_reg8480);  
					stream_33.add(string_literal20);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:10: -> REG8[\"dl\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "dl"));
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:96:5: 'dh'
					{
					string_literal21=(Token)match(input,31,FOLLOW_31_in_reg8491);  
					stream_31.add(string_literal21);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 96:10: -> REG8[\"dh\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG8, "dh"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reg8"


	public static class reg16_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reg16"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:99:1: reg16 : ( 'ax' -> REG16[\"ax\"] | 'bx' -> REG16[\"bx\"] | 'cx' -> REG16[\"cx\"] | 'dx' -> REG16[\"dx\"] | 'si' -> REG16[\"si\"] | 'di' -> REG16[\"di\"] | 'sp' -> REG16[\"sp\"] | 'bp' -> REG16[\"bp\"] );
	public final x64Parser.reg16_return reg16() throws RecognitionException {
		x64Parser.reg16_return retval = new x64Parser.reg16_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal22=null;
		Token string_literal23=null;
		Token string_literal24=null;
		Token string_literal25=null;
		Token string_literal26=null;
		Token string_literal27=null;
		Token string_literal28=null;
		Token string_literal29=null;

		Object string_literal22_tree=null;
		Object string_literal23_tree=null;
		Object string_literal24_tree=null;
		Object string_literal25_tree=null;
		Object string_literal26_tree=null;
		Object string_literal27_tree=null;
		Object string_literal28_tree=null;
		Object string_literal29_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:100:3: ( 'ax' -> REG16[\"ax\"] | 'bx' -> REG16[\"bx\"] | 'cx' -> REG16[\"cx\"] | 'dx' -> REG16[\"dx\"] | 'si' -> REG16[\"si\"] | 'di' -> REG16[\"di\"] | 'sp' -> REG16[\"sp\"] | 'bp' -> REG16[\"bp\"] )
			int alt7=8;
			switch ( input.LA(1) ) {
			case 23:
				{
				alt7=1;
				}
				break;
			case 27:
				{
				alt7=2;
				}
				break;
			case 30:
				{
				alt7=3;
				}
				break;
			case 34:
				{
				alt7=4;
				}
				break;
			case 65:
				{
				alt7=5;
				}
				break;
			case 32:
				{
				alt7=6;
				}
				break;
			case 66:
				{
				alt7=7;
				}
				break;
			case 26:
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:100:5: 'ax'
					{
					string_literal22=(Token)match(input,23,FOLLOW_23_in_reg16510);  
					stream_23.add(string_literal22);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:10: -> REG16[\"ax\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "ax"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:101:5: 'bx'
					{
					string_literal23=(Token)match(input,27,FOLLOW_27_in_reg16521);  
					stream_27.add(string_literal23);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 101:10: -> REG16[\"bx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "bx"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:102:5: 'cx'
					{
					string_literal24=(Token)match(input,30,FOLLOW_30_in_reg16532);  
					stream_30.add(string_literal24);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:10: -> REG16[\"cx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "cx"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:103:5: 'dx'
					{
					string_literal25=(Token)match(input,34,FOLLOW_34_in_reg16543);  
					stream_34.add(string_literal25);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:10: -> REG16[\"dx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "dx"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:104:5: 'si'
					{
					string_literal26=(Token)match(input,65,FOLLOW_65_in_reg16554);  
					stream_65.add(string_literal26);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:10: -> REG16[\"si\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "si"));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:105:5: 'di'
					{
					string_literal27=(Token)match(input,32,FOLLOW_32_in_reg16565);  
					stream_32.add(string_literal27);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:10: -> REG16[\"di\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "di"));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:106:5: 'sp'
					{
					string_literal28=(Token)match(input,66,FOLLOW_66_in_reg16576);  
					stream_66.add(string_literal28);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 106:10: -> REG16[\"sp\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "sp"));
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:107:5: 'bp'
					{
					string_literal29=(Token)match(input,26,FOLLOW_26_in_reg16587);  
					stream_26.add(string_literal29);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 107:10: -> REG16[\"bp\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG16, "bp"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reg16"


	public static class reg32_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reg32"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:110:1: reg32 : ( 'eax' -> REG32[\"eax\"] | 'ebx' -> REG32[\"ebx\"] | 'ecx' -> REG32[\"ecx\"] | 'edx' -> REG32[\"edx\"] | 'esi' -> REG32[\"esi\"] | 'edi' -> REG32[\"edi\"] | 'esp' -> REG32[\"esp\"] | 'ebp' -> REG32[\"ebp\"] );
	public final x64Parser.reg32_return reg32() throws RecognitionException {
		x64Parser.reg32_return retval = new x64Parser.reg32_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal30=null;
		Token string_literal31=null;
		Token string_literal32=null;
		Token string_literal33=null;
		Token string_literal34=null;
		Token string_literal35=null;
		Token string_literal36=null;
		Token string_literal37=null;

		Object string_literal30_tree=null;
		Object string_literal31_tree=null;
		Object string_literal32_tree=null;
		Object string_literal33_tree=null;
		Object string_literal34_tree=null;
		Object string_literal35_tree=null;
		Object string_literal36_tree=null;
		Object string_literal37_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:111:3: ( 'eax' -> REG32[\"eax\"] | 'ebx' -> REG32[\"ebx\"] | 'ecx' -> REG32[\"ecx\"] | 'edx' -> REG32[\"edx\"] | 'esi' -> REG32[\"esi\"] | 'edi' -> REG32[\"edi\"] | 'esp' -> REG32[\"esp\"] | 'ebp' -> REG32[\"ebp\"] )
			int alt8=8;
			switch ( input.LA(1) ) {
			case 35:
				{
				alt8=1;
				}
				break;
			case 37:
				{
				alt8=2;
				}
				break;
			case 38:
				{
				alt8=3;
				}
				break;
			case 40:
				{
				alt8=4;
				}
				break;
			case 41:
				{
				alt8=5;
				}
				break;
			case 39:
				{
				alt8=6;
				}
				break;
			case 42:
				{
				alt8=7;
				}
				break;
			case 36:
				{
				alt8=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:111:5: 'eax'
					{
					string_literal30=(Token)match(input,35,FOLLOW_35_in_reg32606);  
					stream_35.add(string_literal30);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 111:11: -> REG32[\"eax\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "eax"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:112:5: 'ebx'
					{
					string_literal31=(Token)match(input,37,FOLLOW_37_in_reg32617);  
					stream_37.add(string_literal31);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 112:11: -> REG32[\"ebx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "ebx"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:113:5: 'ecx'
					{
					string_literal32=(Token)match(input,38,FOLLOW_38_in_reg32628);  
					stream_38.add(string_literal32);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 113:11: -> REG32[\"ecx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "ecx"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:114:5: 'edx'
					{
					string_literal33=(Token)match(input,40,FOLLOW_40_in_reg32639);  
					stream_40.add(string_literal33);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:11: -> REG32[\"edx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "edx"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:115:5: 'esi'
					{
					string_literal34=(Token)match(input,41,FOLLOW_41_in_reg32650);  
					stream_41.add(string_literal34);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:11: -> REG32[\"esi\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "esi"));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:116:5: 'edi'
					{
					string_literal35=(Token)match(input,39,FOLLOW_39_in_reg32661);  
					stream_39.add(string_literal35);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:11: -> REG32[\"edi\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "edi"));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:117:5: 'esp'
					{
					string_literal36=(Token)match(input,42,FOLLOW_42_in_reg32672);  
					stream_42.add(string_literal36);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:11: -> REG32[\"esp\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "esp"));
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:118:5: 'ebp'
					{
					string_literal37=(Token)match(input,36,FOLLOW_36_in_reg32683);  
					stream_36.add(string_literal37);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:11: -> REG32[\"ebp\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "ebp"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reg32"


	public static class reg64_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reg64"
	// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:121:1: reg64 : ( 'rax' -> REG32[\"rax\"] | 'rbx' -> REG32[\"rbx\"] | 'rcx' -> REG32[\"rcx\"] | 'rdx' -> REG32[\"rdx\"] | 'rsi' -> REG32[\"rsi\"] | 'rdi' -> REG32[\"rdi\"] | 'rsp' -> REG32[\"rsp\"] | 'rbp' -> REG32[\"rbp\"] | 'r8' -> REG32[\"r8\" ] | 'r9' -> REG32[\"r9\" ] | 'r10' -> REG32[\"r10\"] | 'r11' -> REG32[\"r11\"] | 'r12' -> REG32[\"r12\"] | 'r13' -> REG32[\"r13\"] | 'r14' -> REG32[\"r14\"] | 'r15' -> REG32[\"r15\"] );
	public final x64Parser.reg64_return reg64() throws RecognitionException {
		x64Parser.reg64_return retval = new x64Parser.reg64_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal38=null;
		Token string_literal39=null;
		Token string_literal40=null;
		Token string_literal41=null;
		Token string_literal42=null;
		Token string_literal43=null;
		Token string_literal44=null;
		Token string_literal45=null;
		Token string_literal46=null;
		Token string_literal47=null;
		Token string_literal48=null;
		Token string_literal49=null;
		Token string_literal50=null;
		Token string_literal51=null;
		Token string_literal52=null;
		Token string_literal53=null;

		Object string_literal38_tree=null;
		Object string_literal39_tree=null;
		Object string_literal40_tree=null;
		Object string_literal41_tree=null;
		Object string_literal42_tree=null;
		Object string_literal43_tree=null;
		Object string_literal44_tree=null;
		Object string_literal45_tree=null;
		Object string_literal46_tree=null;
		Object string_literal47_tree=null;
		Object string_literal48_tree=null;
		Object string_literal49_tree=null;
		Object string_literal50_tree=null;
		Object string_literal51_tree=null;
		Object string_literal52_tree=null;
		Object string_literal53_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

		try {
			// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:122:3: ( 'rax' -> REG32[\"rax\"] | 'rbx' -> REG32[\"rbx\"] | 'rcx' -> REG32[\"rcx\"] | 'rdx' -> REG32[\"rdx\"] | 'rsi' -> REG32[\"rsi\"] | 'rdi' -> REG32[\"rdi\"] | 'rsp' -> REG32[\"rsp\"] | 'rbp' -> REG32[\"rbp\"] | 'r8' -> REG32[\"r8\" ] | 'r9' -> REG32[\"r9\" ] | 'r10' -> REG32[\"r10\"] | 'r11' -> REG32[\"r11\"] | 'r12' -> REG32[\"r12\"] | 'r13' -> REG32[\"r13\"] | 'r14' -> REG32[\"r14\"] | 'r15' -> REG32[\"r15\"] )
			int alt9=16;
			switch ( input.LA(1) ) {
			case 56:
				{
				alt9=1;
				}
				break;
			case 58:
				{
				alt9=2;
				}
				break;
			case 59:
				{
				alt9=3;
				}
				break;
			case 61:
				{
				alt9=4;
				}
				break;
			case 63:
				{
				alt9=5;
				}
				break;
			case 60:
				{
				alt9=6;
				}
				break;
			case 64:
				{
				alt9=7;
				}
				break;
			case 57:
				{
				alt9=8;
				}
				break;
			case 54:
				{
				alt9=9;
				}
				break;
			case 55:
				{
				alt9=10;
				}
				break;
			case 48:
				{
				alt9=11;
				}
				break;
			case 49:
				{
				alt9=12;
				}
				break;
			case 50:
				{
				alt9=13;
				}
				break;
			case 51:
				{
				alt9=14;
				}
				break;
			case 52:
				{
				alt9=15;
				}
				break;
			case 53:
				{
				alt9=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:122:5: 'rax'
					{
					string_literal38=(Token)match(input,56,FOLLOW_56_in_reg64704);  
					stream_56.add(string_literal38);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:11: -> REG32[\"rax\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rax"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:123:5: 'rbx'
					{
					string_literal39=(Token)match(input,58,FOLLOW_58_in_reg64715);  
					stream_58.add(string_literal39);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:11: -> REG32[\"rbx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rbx"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:124:5: 'rcx'
					{
					string_literal40=(Token)match(input,59,FOLLOW_59_in_reg64726);  
					stream_59.add(string_literal40);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:11: -> REG32[\"rcx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rcx"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:125:5: 'rdx'
					{
					string_literal41=(Token)match(input,61,FOLLOW_61_in_reg64737);  
					stream_61.add(string_literal41);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:11: -> REG32[\"rdx\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rdx"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:126:5: 'rsi'
					{
					string_literal42=(Token)match(input,63,FOLLOW_63_in_reg64748);  
					stream_63.add(string_literal42);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:11: -> REG32[\"rsi\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rsi"));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:127:5: 'rdi'
					{
					string_literal43=(Token)match(input,60,FOLLOW_60_in_reg64759);  
					stream_60.add(string_literal43);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:11: -> REG32[\"rdi\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rdi"));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:128:5: 'rsp'
					{
					string_literal44=(Token)match(input,64,FOLLOW_64_in_reg64770);  
					stream_64.add(string_literal44);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 128:11: -> REG32[\"rsp\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rsp"));
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:129:5: 'rbp'
					{
					string_literal45=(Token)match(input,57,FOLLOW_57_in_reg64781);  
					stream_57.add(string_literal45);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:11: -> REG32[\"rbp\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "rbp"));
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:130:5: 'r8'
					{
					string_literal46=(Token)match(input,54,FOLLOW_54_in_reg64792);  
					stream_54.add(string_literal46);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 130:11: -> REG32[\"r8\" ]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r8"));
					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:131:5: 'r9'
					{
					string_literal47=(Token)match(input,55,FOLLOW_55_in_reg64804);  
					stream_55.add(string_literal47);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 131:11: -> REG32[\"r9\" ]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r9"));
					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:132:5: 'r10'
					{
					string_literal48=(Token)match(input,48,FOLLOW_48_in_reg64816);  
					stream_48.add(string_literal48);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:11: -> REG32[\"r10\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r10"));
					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:133:5: 'r11'
					{
					string_literal49=(Token)match(input,49,FOLLOW_49_in_reg64827);  
					stream_49.add(string_literal49);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:11: -> REG32[\"r11\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r11"));
					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:134:5: 'r12'
					{
					string_literal50=(Token)match(input,50,FOLLOW_50_in_reg64838);  
					stream_50.add(string_literal50);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:11: -> REG32[\"r12\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r12"));
					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:135:5: 'r13'
					{
					string_literal51=(Token)match(input,51,FOLLOW_51_in_reg64849);  
					stream_51.add(string_literal51);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:11: -> REG32[\"r13\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r13"));
					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:136:5: 'r14'
					{
					string_literal52=(Token)match(input,52,FOLLOW_52_in_reg64860);  
					stream_52.add(string_literal52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:11: -> REG32[\"r14\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r14"));
					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// F:\\jssembly\\core\\src\\com\\polyfx\\jssembly\\platforms\\x64\\x64.g:137:5: 'r15'
					{
					string_literal53=(Token)match(input,53,FOLLOW_53_in_reg64871);  
					stream_53.add(string_literal53);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:11: -> REG32[\"r15\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REG32, "r15"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reg64"

	// Delegated rules



	public static final BitSet FOLLOW_assembly_in_start146 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_assembly166 = new BitSet(new long[]{0x4000F80000008002L});
	public static final BitSet FOLLOW_NL_in_assembly168 = new BitSet(new long[]{0x4000F80000000002L});
	public static final BitSet FOLLOW_nullary_instruction_in_instruction186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_instruction_in_instruction200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullary_opcode_in_nullary_instruction226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_opcode_in_unary_instruction243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_nullary_opcode258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_nullary_opcode271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_nullary_opcode283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_nullary_opcode294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_nullary_opcode305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_unary_opcode325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_reg8414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_reg8425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_reg8436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_reg8447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_reg8458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_reg8469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_reg8480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_reg8491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_reg16510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_reg16521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_reg16532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_reg16543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_reg16554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_reg16565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_reg16576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_reg16587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_reg32606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_reg32617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_reg32628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_reg32639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_reg32650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_reg32661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_reg32672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_reg32683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_reg64704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_reg64715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_reg64726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_reg64737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_reg64748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_reg64759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_reg64770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_reg64781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_reg64792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_reg64804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_reg64816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_reg64827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_reg64838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_reg64849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_reg64860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_reg64871 = new BitSet(new long[]{0x0000000000000002L});
}
