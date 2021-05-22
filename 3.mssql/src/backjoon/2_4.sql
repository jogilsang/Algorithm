
-- mssql
-- Q : ﻿2884번
-- C:\algo\Algorithm\mssql\src\backjoon
-- DROP PROC main2_4

CREATE PROC main2_4
	@a varchar(100),
	@b varchar(100)
AS
	-- A값 변화 X
	IF(@b >= 45)
		BEGIN
			SET @b = @b -45;
		END
	-- A값 변화 O
	ELSE
		-- 0 이 아니면 당일
			SET @b = 45 - @b;
			SET @b = 60 - @b;
		IF(@a != 0) 
			BEGIN
				SET @a = @a -1;
			END
		ELSE
			BEGIN
				SET @a = 23;
			END
			
	PRINT @a + @b;
GO

EXEC main2_4 9, 25