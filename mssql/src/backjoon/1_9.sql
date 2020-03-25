-- MSSQL
-- Q : 1008
--DROP PROC main1_9

CREATE PROC main1_9
	@param1 int,
	@param2 int
AS
	PRINT @param1 / @param2
	DECLARE @div int = 0

	SET @div = @param1 * @param2
GO

EXEC main1_9 90,9