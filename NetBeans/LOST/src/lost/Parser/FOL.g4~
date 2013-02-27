
grammar FOL ;

condition
  : formula EOF ;

formula
  : TRUTH
  | FALSITY
  | term EQUALS term
  | relation
  | quantifier formula
  | NOT formula
  | formula AND formula
  | formula OR formula 
  | formula IMPLIES formula
  | formula EQUIV formula 
  | LPAREN formula RPAREN ;

term
  : VARIABLE
  | NAME ;

quantifier
  : FORALL VARIABLE
  | EXISTS VARIABLE ;

relation
    : NAME binaryarg
    | NAME unaryarg
    | NAME ;

binaryarg
    : LPAREN term ',' term RPAREN ;

unaryarg
    : LPAREN term RPAREN ;

//---------------------------------------------------------------------------

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
NAME	 : [A-Z] | [a-zA-Z] [a-zA-Z09'_']+ ;
WS       : [ \t\r\n]+ -> skip ;

// ∀x(R(Fred,x) →  ∀y(R(x,y) → P(y)))
// ∃x∀y (A ∨ B) ∧ B ∧ ¬D ∧ E ∧ F ∨ G ∨ H
// ∃x∀y (A ∨ B) ∧ B ∨ ¬D ∧ E ∧ F ∨ G ∨ H
// ∃x∀y (A ∨ B) → B ∨ (¬D) ∧ E ∧ (F ∨ G) ∨ H
// A ∨ ¬B ∧ C
// B ∨ (¬D) ∧ E ∨ H ∧ E
// Loves(fred,wilma) ↔ is_in_the_air(love)
// ⊤
// brian = rian
// ∃x∀ys(happy(x) → ¬A)
// ∀x(Red(Fred,x) ∧ E ∧ E ∧ E ∨ H → E →  ∀y(R(x,y) → P(y)))
// A → B → C → D → E (Assumes A → B → C means (A → B) → C)
// A → B → C → (D → E)
