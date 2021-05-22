-- MSSQL
-- Q : ﻿10869
-- DROP PROC main1_10

CREATE PROC main1_10
	@param1 INT,
	@param2 INT
AS
	DECLARE @sum INT = 0;
    DECLARE @sub INT = 0;
    DECLARE @multi INT = 0;
    DECLARE @div INT = 0;
    DECLARE @remain INT = 0;

	SET @sum = @param1 + @param2;
	SET @sub = @param1 - @param2;
	SET @multi = @param1 * @param2;
	SET @div = @param1 / @param2;
	SET @remain = @param1 % @param2;

	PRINT 'sum : ' + CONVERT(varchar, @sum);
	PRINT 'sub : ' + CONVERT(varchar, @sub);
	PRINT 'multi : ' +  CONVERT(varchar, @multi);
	PRINT 'div : '  + CONVERT(varchar, @div);
	PRINT 'remain : ' + CONVERT(varchar, @remain);
GO

EXEC main1_10 9,8