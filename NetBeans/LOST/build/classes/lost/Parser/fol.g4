//-----------------------------------------------------------------------------
//     PARSER RULES
//-----------------------------------------------------------------------------

grammar fol;

condition: formula EOF! ;

formula	
	: ((FORALL | EXISTS) VARIABLE) LPAREN? formula RPAREN?
	| equivalence
	| implication
	| disjunction
	| conjunction
	| nonRecursiveFormula ;

equivalence
	: nonRecursiveFormula EQUIV formula ;

implication
	: nonRecursiveFormula IMPLIES formula ;

disjunction
	: nonRecursiveFormula OR formula ;

conjunction
	: nonRecursiveFormula AND formula ;

negation 
	: NOT formula ;

relation 
	: NAME binaryarg
	| NAME unaryarg
	| NAME ;

binaryarg
	: LPAREN term ',' term RPAREN ;

unaryarg
	: LPAREN term RPAREN ;

term
	: VARIABLE
	| NAME ;

nonRecursiveFormula
	: negation
	| term EQUALS term
	| relation
	| TRUTH
	| FALSITY ;

	

//-----------------------------------------------------------------------------
// 	LEXER RULES
//-----------------------------------------------------------------------------

LPAREN   : '(' ;
RPAREN   : ')' ;
AND      : '∧' ;
OR       : '∨' ;
NOT      : '¬' ;
IMPLIES  : '→' ;
EXISTS	 : '∃' ;
FORALL	 : '∀' ;
TRUTH    : '⊤' ;
FALSITY  : '⊥' ;
EQUALS	 : '=' ;
EQUIV	 : '↔' ;
VARIABLE : [a-z] [0-9]* ;
NAME     : [A-Z] | [a-zA-Z] [a-zA-Z0-9'_']+ ;
WS       : [ \t\r\n]+ -> skip ;	//ingnore white spaces, nl etc.










