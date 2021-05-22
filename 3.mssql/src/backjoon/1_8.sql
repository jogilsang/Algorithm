-- MSSQL
-- Q : 1000
--DROP PROC main1_8

CREATE PROC main1_8
	@param1 int,
	@param2 int
AS
	PRINT @param1 * @param2
	DECLARE @multi int = 0
	SET @multi = @param1 * @param2
GO

EXEC main1_8 5,9