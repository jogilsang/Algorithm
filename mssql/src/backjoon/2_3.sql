-- mssql
-- Q : ﻿2753번
-- C:\algo\Algorithm\mssql\src\backjoon

DROP PROC main2_3

CREATE PROC main2_3
	@value INT
AS
	IF(((@value / 4) = 1 AND (@value / 100) != 1) OR (@value / 400 = 1)) 
		BEGIN
			PRINT '윤년';
		END
	ELSE
		BEGIN
			PRINT '윤년 아님';
		END
GO

EXEC main2_3 1900
