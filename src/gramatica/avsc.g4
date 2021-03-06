grammar avsc;

goal: mainClass (classDeclaration)*;

mainClass: 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}';

classDeclaration: 'class' IDENTIFIER ('extends' IDENTIFIER)? '{' ( varDeclaration )* ( methodDeclaration )* '}';

varDeclaration: type IDENTIFIER ';';

methodDeclaration: 'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';

type: 'int' '[' ']'
	| 'boolean'
	| 'int'
	| IDENTIFIER;

statement: statementList
		| ifElse
		| whileLoop
		| print
		| assign
		| arrayAssign;
		
statementList: '{' ( statement )* '}';
		
ifElse: 'if' '(' expression ')' statement 'else' statement;

whileLoop: 'while' '(' expression ')' statement;
		
print: 'System.out.println' '(' expression ')' ';';

assign: IDENTIFIER '=' expression ';';

arrayAssign: IDENTIFIER '[' expression ']' '=' expression ';';

expression: '(' expression ')'
		| not
		| IDENTIFIER
		| INTEGER_LITERAL
		| expression ( '&&' | '<' | '+' | '-' | '*' ) expression
		| expression '[' expression ']'
		| newArray
		| expression '.' 'length'
		| newObject
		| expression '.' IDENTIFIER '(' ( expression ( ',' expression )* )? ')'
		| 'true'
		| 'false'
		| 'this'
		;
		
not: '!' expression;
		
newArray: 'new' 'int' '[' expression ']';

newObject: 'new' IDENTIFIER '(' ')';

IDENTIFIER: [_a-zA-Z] [_a-zA-Z0-9]*;

INTEGER_LITERAL: '0' | [1-9] [0-9]*;

SINGLE_LINE_COMMENT: '//' (~[\r\n])* [\r\n] -> skip;

MULTI_LINE_COMMENT: '/*' (~['*/'])* '*/' -> skip;

WHITESPACE : [ \t\r\n]+ -> skip;
