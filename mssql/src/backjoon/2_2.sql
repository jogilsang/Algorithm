<<<<<<< HEAD
﻿-- mssql
-- Q : ﻿9498번
-- C:\algo\Algorithm\mssql\src\backjoon

DROP PROC main2_2
=======

--DROP PROC main2_2
>>>>>>> ca5f61c4e005d6c58002e90414797f7271ff9612

CREATE PROC main2_2
	@input INT
AS
		IF(@input >= 90 AND @input <= 100)
			BEGIN
				PRINT 'A';
			END
		ELSE IF(@input >= 80 AND @input < 90)
			BEGIN
				PRINT  'B';
			END
		ELSE IF(@input >= 70 AND @input < 80)
			BEGIN
				PRINT 'C';
			END
		ELSE IF(@input >= 60 AND @input < 70)
			BEGIN
				PRINT 'D';
			END
		ELSE 
			BEGIN
				PRINT 'F';
			END
			
GO

EXEC main2_2 80