--mssql
-- Q : 1000
--DROP PROC main1_6

CREATE PROC main1_6
	@param1 int,
	@param2 int
		AS
			-- 1锅 规过
			PRINT @param1+@param2;

			-- 2锅 规过
			DECLARE @sum int = 0;
			SET @sum = @param1 + @param2;
			PRINT @sum;
		GO

EXEC main1_6 1,3