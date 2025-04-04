grammar MishiSQLanguage;

start
:
	query+ EOF
;

// Syntax Rules
query
	: selectQuery
	// | insertQuery
	// | updateQuery
	// | deleteQuery
	// | createTableQuery
	// | alterTableQuery
	// | dropTableQuery
	// | useDatabaseQuery
	;

selectQuery :
		IMP_ORDER SELECT (ALL | (SPECIFIC_COL ids+=ID (COMMA ids+=ID)*)) 
		FROM tableId=ID (WHERE condition)? (ORDER BY orderID=ID (ASC | DESC)?)? (LIMIT INT)? (OFFSET INT)?
	;

condition
	: condition (AND | OR) condition
	| NOT condition
	| LPAREN condition RPAREN
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID 'SEA' (EQUAL | NOT_EQUAL | LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL) value
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID IN LPAREN value (COMMA value)* RPAREN
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID LIKE value
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID IS NULL
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID BETWEEN value AND value
	;

value
	: INT
	| DOUBLE
	| VARCHAR
	| BOOLEAN
	| ID
	| LPAREN value (COMMA value)* RPAREN
	;


// Lexer Rules

// SQL Types

// Order
IMP_ORDER : 'MISHI';
// Keywords
SELECT : 'MUESTRAME';
// Select *
ALL : 'TODOS LOS MISHI DATOS';
SPECIFIC_COL: 'LOS MISHICAMPOS';
SPECIFIC_ATTR : 'EL CAMPO';
FROM : 'DE';
WHERE : 'DONDE';
AND : 'Y';
OR : 'O';
NOT : 'NOT';
IN : 'IN';
LIKE : 'LIKE';

IS : 'IS';
NULL : 'VACIO';
ORDER : 'ORDENAR';
BY : 'POR';
ASC : 'ASCENDENTE';
DESC : 'DESCENDENTE';
LIMIT : 'LIMIT';
OFFSET : 'OFFSET';
INSERT : 'AGREGA A';
INTO : 'INTO';
VALUES : 'LOS VALORES';
UPDATE : 'ACTUALIZA LA';
SET : 'ASIGNA';
DELETE : 'ELIMINA';
CREATE : 'HAZME UNA';
USE : 'USA LA BD';
TABLE : 'TABLA';
ALTER : 'MODIFICA';
DROP : 'BORRA';
ADD : 'AGREGA';
COLUMN : 'COLUMNA';
PRIMARY : 'PRIMARIA';

// Comparison Operators
EQUAL : 'IGUAL A';
NOT_EQUAL : 'DIFERENTE DE';
LESS_THAN : 'MENOR QUE';
LESS_THAN_EQUAL : 'MENOR O IGUAL QUE';
GREATER_THAN : 'MAYOR QUE';
GREATER_THAN_EQUAL : 'MAYOR O IGUAL QUE';
BETWEEN : 'ESTE ENTRE';

COMMA : ',';
LPAREN : '(';
RPAREN : ')';

// Data Types
ID : [a-zA-Z]+;
INT : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
VARCHAR : '\''[a-zA-Z0-9]*'\'';
BOOLEAN : 'TRUE' | 'FALSE';

WS
:
	[ \t\r\n]+ -> skip
;