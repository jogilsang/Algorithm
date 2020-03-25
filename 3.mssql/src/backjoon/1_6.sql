--mssql
-- Q : 1000
--DROP PROC main1_6

CREATE PROC main1_7
	@param1 int,
	@param2 int
		AS
			-- 1번 방법
			PRINT @param1+@param2;

			-- 2번 방법
			DECLARE @sum int = 0;
			SET @sum = @param1 + @param2;
			PRINT @sum;
		GO

EXEC main1_6 1,3