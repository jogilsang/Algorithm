-- MS-SQL
-- Q : 2557
--DROP PROC main
CREATE PROC main
	AS
		DECLARE @count INT = 2
		WHILE (@count != 0)
			BEGIN
					PRINT '강한친구 대한육군';
					SET @count = @count - 1
			END

	GO


EXEC main;






























