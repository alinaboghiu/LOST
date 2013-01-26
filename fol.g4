//-----------------------------------------------------------------------------
//     PARSER RULES
//-----------------------------------------------------------------------------

grammar fol;

condition: sentence EOF! ;

sentence	
    :   LPAREN? 
		((FORALL | EXISTS) TERM)+
        (implication | conjunction | disjunction | negation | relation) 
		RPAREN?
	|	negation
	|	RELNAME ;

implication
	:	sentence IMPLIES sentence ;

disjunction
	:	sentence OR sentence ;

conjunction
	:	sentence AND sentence ;

negation 
	:	NOT sentence ;


relation 
	:	RELNAME binaryarg
	| 	RELNAME unaryarg
	|	RELNAME ;

binaryarg
	:	LPAREN TERM ',' TERM RPAREN ;

unaryarg
	:	LPAREN TERM RPAREN ;


//-----------------------------------------------------------------------------
// 	LEXER RULES
//-----------------------------------------------------------------------------

LPAREN  : '(' ;
RPAREN  : ')' ;
AND     : '∧' ;
OR      : '∨' ;
NOT     : '¬' ;
IMPLIES : '→' ;
FORALL  : 'Forall' ;
EXISTS  : 'Exists' ;

TERM: [a-zA-Z] [a-zA-Z0-9'_']* ;
RELNAME: [a-z] [a-zA-Z0-9'_']* ;
WS : [ \t\r\n]+ -> skip ;










