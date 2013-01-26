//-----------------------------------------------------------------------------
//     PARSER RULES
//-----------------------------------------------------------------------------

grammar fol;

condition: sentence EOF! ;

sentence	
    :   TRUTH
	|	FALSITY
	|	TERM EQUALS TERM
	|	relation
//	|	equivalence
//	|	implication
//	|	disjunction
//	|	conjunction
//	|	negation
	|	((FORALL | EXISTS) VARIABLE)? equivalence ;

equivalence
	:	implication (EQUIV equivalence)* ;

implication
	:	disjunction (IMPLIES implication)* ;

disjunction
	:	conjunction (OR disjunction)* ;

conjunction
	:	negation (AND conjunction)* ;

negation 
	:	NOT? relation ;


relation 
	:	LPAREN? RELNAME binaryarg RPAREN
	| 	LPAREN? RELNAME unaryarg RPAREN
	|	RELNAME ;

binaryarg
	:	LPAREN TERM ',' TERM RPAREN ;

unaryarg
	:	LPAREN TERM RPAREN ;

TERM
	: VARIABLE
	| CONSTANT ;

//-----------------------------------------------------------------------------
// 	LEXER RULES
//-----------------------------------------------------------------------------

LPAREN  : '(' ;
RPAREN  : ')' ;
AND     : '∧' ;
OR      : '∨' ;
NOT     : '¬' ;
IMPLIES : '→' ;
EXISTS	: '∃' ;
FORALL	: '∀' ;
TRUTH   : 'T' ;
FALSITY : 'F' ;
EQUALS	: '=';
EQUIV	: '↔' ;

VARIABLE: [s-z] [0-9]* ;
CONSTANT: [a-zA-Z] [a-zA-Z0-9'_']* ;
RELNAME : [a-zA-Z] [a-zA-Z0-9'_']* ;
WS      : [ \t\r\n]+ -> skip ;	//ingnore white spaces, nl etc.










