//-----------------------------------------------------------------------------
//     PARSER RULES
//-----------------------------------------------------------------------------

grammar FOL ;

condition
    : (LPAREN formula RPAREN | formula) EOF! ;

formula
	: (LPAREN equivalence RPAREN | equivalence) ;
//	: (LPAREN disjunction RPAREN | disjunction) ;

equivalence
	: ((LPAREN implication RPAREN | implication) EQUIV)* 
       (LPAREN implication RPAREN | implication) ;

implication 
	: ((LPAREN disjunction RPAREN | disjunction) IMPLIES)* 
       (LPAREN disjunction RPAREN | disjunction) ;

disjunction
	: ((LPAREN conjunction RPAREN | conjunction) OR)* 
       (LPAREN conjunction RPAREN | conjunction) ;

conjunction
	: ((LPAREN negation RPAREN | negation) AND)* 
       (LPAREN negation RPAREN | negation) ;

negation
	: NOT+ quantifier* (LPAREN nonRecursiveFormula RPAREN | nonRecursiveFormula)
	| NOT+ quantifier* (LPAREN formula RPAREN | formula )
	| quantifier+ NOT* (LPAREN nonRecursiveFormula RPAREN | nonRecursiveFormula)
	| quantifier+ NOT* (LPAREN formula RPAREN | formula )
	| (nonRecursiveFormula | LPAREN nonRecursiveFormula RPAREN);
	
relation
    : RELNAME binaryarg
    | RELNAME unaryarg
    | RELNAME ;

binaryarg
    : LPAREN term ',' term RPAREN ;

unaryarg
    : LPAREN term RPAREN ;

quantifier
    : (FORALL | EXISTS) VARIABLE ;

term
    : VARIABLE
    | constant ;

constant
	: RELNAME ;

nonRecursiveFormula
    : relation
    | term EQUALS term
    | TRUTH
    | FALSITY ;

//-----------------------------------------------------------------------------
// 	LEXER RULES
//-----------------------------------------------------------------------------

LPAREN   : '('	;
RPAREN   : ')'	; 
AND      : '∧'	;
OR       : '∨'	;
NOT      : '¬'	;
IMPLIES  : '→'	;
EXISTS	 : '∃'	;
FORALL	 : '∀'	;
TRUTH    : '⊤'	;
FALSITY  : '⊥'	;
EQUALS	 : '='	;
EQUIV	 : '↔'	;

VARIABLE : [a-z] 's'? [0-9]* ;
RELNAME	 : [a-zA-Z] [a-zA-Z0-9'_']* ;
WS       : [ \t\r\n]+ -> skip ;

// ∃x∀y (A ∨ B) ∧ B ∧ ¬D ∧ E ∧ F ∨ G ∨ H

