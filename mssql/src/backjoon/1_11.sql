-- MSSQL
-- Q : ﻿﻿10430
-- 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

DROP PROC main1_11

CREATE PROC main1_11
	@param1 INT,
	@param2 INT,
	@param3 INT
AS
    DECLARE @line1 INT = ((@param1) + @param2) % @param3			;
    DECLARE @line2 INT = (@param1 % @param3 + @param2 % @param3) % @param3	;
    DECLARE @line3 INT = (@param1 * @param2) % @param3			;
    DECLARE @line4 INT = (@param1 % @param3 * @param2 % @param3) % @param3	;
    
    PRINT @line1;
    PRINT @line2;
    PRINT @line3;
    PRINT @line4;

GO

EXEC main1_11 5,9,10