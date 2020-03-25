-- MSSQL
-- Q : 1000
--DROP PROC main1_7

CREATE PROC main1_7
	@param1 int,
	@param2 int
AS
	PRINT @param1 - @param2;
	DECLARE @value INT = 0;

	SET @value = @param1 - @param2;

GO

EXEC main1_7 5,8