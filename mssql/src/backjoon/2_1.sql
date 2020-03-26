-- mssql
-- Q : ﻿1330번
-- C:\algo\Algorithm\mssql\src\backjoon

CREATE PROC main2_1
	@param1 INT,
	@param2 INT
AS
	IF (@param1 > @param2)
		BEGIN
				PRINT '>';
		END

	ELSE IF (@param1 < @param2)
		BEGIN
				PRINT '<';
		END
	ELSE IF (@param1 = @param2)
		BEGIN
				PRINT '==';
		END

GO

EXEC main2_1 50,90































