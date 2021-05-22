-- MSSQL
-- Q : ﻿2588번
-- 두 숫자 모두 세자리

CREATE PROC main1_12 
	@A INT,
	@B INT
AS
    --// 두 숫자 모두 세자리
    DECLARE @line1 INT = @A * ((@B % 100) % 10);
    DECLARE @line2 INT = @A * ((@B % 100) / 10 );
    DECLARE @line3 INT = @A * (@B / 100);
    DECLARE @line4 INT = @A * @B;

    PRINT @line1;
    PRINT @line2;
    PRINT @line3;
    PRINT @line4;
GO

EXEC main1_12 100,200