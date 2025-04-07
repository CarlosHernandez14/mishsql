grammar MishiSQLanguage;

start
:
	query+ EOF
;

// Syntax Rules
query
: 
	selectQuery
	| createDatabaseQuery
	| useDatabaseQuery
	| createTableQuery
	| insertQuery

	// | updateQuery
	// | deleteQuery
	// | alterTableQuery
	// | dropTableQuery
;

selectQuery :
		IMP_ORDER SELECT (ALL | (SPECIFIC_COL ids+=ID (COMMA ids+=ID)*)) 
		(
			(FROM tableId=ID) | from_join+
		) 
		(WHERE condition)? (ORDER BY orderID=ID FROM tableidOrder=ID (ASC | DESC)?)? (LIMIT limitValue=INT 'REGISTROS')? (OFFSET INT)?
	;


from_join :  
		'DE LA' joinType=(INNER_JOIN | LEFT_JOIN | RIGHT_JOIN | FULL_JOIN) 'DE'
		tableIdJoin=ID WITH joinTable=ID ON join_condition
	;
createDatabaseQuery 
:
	IMP_ORDER CREATE ' BASE DE DATOS ' dbName=ID
;

useDatabaseQuery 
:
	IMP_ORDER USE dbName=ID
;

createTableQuery
:
	IMP_ORDER CREATE TABLE tableName=ID 'CON' SPECIFIC_COL tableFields (foreignKeyClause)?
;

tableFields
: 
	tableField (COMMA tableField)* (COMMA)?
;

tableField
: 
	fieldName=ID fieldType=sqlType ('QUE' constraints+=fieldConstraint (constraints+=fieldConstraint)*)?
;

sqlType
: 
	'ENTERO'     
    | 'TEXTO'      
    | 'DECIMAL'    
;

fieldConstraint
: 
	'SEA MISHILLAVE PRIMARIA'  
    | 'NO SEA NULO'          
;

foreignKeyClause
: 
	'Y CON LA MISHILLAVE FORANEA' fkField=ID 'QUE APUNTA A' refField=ID 'DE' refTable=ID
;

insertQuery 
: 
	IMP_ORDER INSERT ID VALUES valueTuples
;

valueTuples
: 
	valueTuple (COMMA valueTuple)*
;

valueTuple
: 
	LPAREN value (COMMA value)* RPAREN
;

condition
: 
	condition (AND | OR) condition
	| NOT condition
	| LPAREN condition RPAREN
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID 'SEA' (EQUAL | NOT_EQUAL | LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL) value
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID IN LPAREN value (COMMA value)* RPAREN
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID LIKE value
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID IS NULL
	| SPECIFIC_ATTR attrName=ID FROM tableName=ID BETWEEN value AND value
;

join_condition
	: SPECIFIC_ATTR attrName=ID FROM tableName=ID 'SEA' EQUAL attrJoin=ID FROM tableJoin=ID
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
CREATE : 'HAZME UNA';
// Select *
ALL : 'TODOS LOS MISHI DATOS';
SPECIFIC_COL: 'LOS MISHICAMPOS';
SPECIFIC_ATTR : 'EL CAMPO';
FROM : 'DE';
WHERE : 'FILTRANDO DONDE';
ON : 'DONDE';

// JOIN TYPES
WITH : 'CON';
INNER_JOIN : 'UNION INTERNA';
LEFT_JOIN : 'UNION IZQUIERDA';
RIGHT_JOIN : 'UNION DERECHA';
FULL_JOIN : 'UNION COMPLETA';

AND : 'Y';
OR : 'O';
NOT : 'NOT';
IN : 'IN';
LIKE : 'LIKE';

IS : 'IS';
NULL : 'VACIO';
ORDER : 'ORDENAMELO';
BY : 'POR';
ASC : 'ASCENDENTE';
DESC : 'DESCENDENTE';
LIMIT : 'PERO SOLO DAME';
OFFSET : 'OFFSET';
INSERT : 'AGREGA A';
INTO : 'INTO';
VALUES : 'LOS VALORES';
UPDATE : 'ACTUALIZA LA';
SET : 'ASIGNA';
DELETE : 'ELIMINA';
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