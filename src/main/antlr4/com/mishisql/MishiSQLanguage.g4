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
		IMP_ORDER SELECT (ALL | (SPECIFIC_COL ids+=ID (',' ids+=ID)*)) 
		FROM tableId=ID (WHERE condition)? (ORDER BY orderID=ID (ASC | DESC)?)? (LIMIT INT)? (OFFSET INT)?
	;

condition
	: ID (IN | LIKE | BETWEEN) (ID | VARCHAR) (AND | OR)? condition?
	| ID (IS | NOT) NULL (AND | OR)? condition?
	| ID '=' (ID | INT | DOUBLE | VARCHAR) (AND | OR)? condition?
	| '(' condition ')' (AND | OR)? condition?
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
FROM : 'DE';
WHERE : 'DONDE';
AND : 'AND';
OR : 'OR';
NOT : 'NOT';
IN : 'IN';
LIKE : 'LIKE';
BETWEEN : 'BETWEEN';
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

ID : [a-zA-Z]+;
INT : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
VARCHAR : '\''[a-zA-Z0-9]*'\'';
BOOLEAN : 'TRUE' | 'FALSE';

WS
:
	[ \t\r\n]+ -> skip
;