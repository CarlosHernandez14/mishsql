grammar MishiSQLanguage;

start
:
	'hello' 'world'
;


// Lexer Rules

// SQL Types
ID : [a-zA-Z]+;
INT : [0-9]+;
DOUBLE : [0-9]+'.'[0-9]+;
VARCHAR : '\''[a-zA-Z0-9]*'\'';
BOOLEAN : 'TRUE' | 'FALSE';

// Keywords
SELECT : 'SELECT';
FROM : 'FROM';
WHERE : 'WHERE';
AND : 'AND';
OR : 'OR';
NOT : 'NOT';
IN : 'IN';
LIKE : 'LIKE';
BETWEEN : 'BETWEEN';
IS : 'IS';
NULL : 'NULL';
ORDER : 'ORDER';
BY : 'BY';
ASC : 'ASC';
DESC : 'DESC';
LIMIT : 'LIMIT';
OFFSET : 'OFFSET';
INSERT : 'INSERT';
INTO : 'INTO';
VALUES : 'VALUES';
UPDATE : 'UPDATE';
SET : 'SET';
DELETE : 'DELETE';
CREATE : 'CREATE';
TABLE : 'TABLE';
ALTER : 'ALTER';
DROP : 'DROP';
ADD : 'ADD';
COLUMN : 'COLUMN';
PRIMARY : 'PRIMARY';


WS
:
	[ \t\r\n]+ -> skip
;