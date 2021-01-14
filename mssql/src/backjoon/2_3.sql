<<<<<<< HEAD
﻿-- mssql
-- Q : ﻿2753번
-- C:\algo\Algorithm\mssql\src\backjoon

DROP PROC main2_3

CREATE PROC main2_3
	@value INT
AS
	IF(((@value / 4) = 1 AND (@value / 100) != 1) OR (@value / 400 = 1)) 
		BEGIN
			PRINT '윤년';
		END
	ELSE
		BEGIN
			PRINT '윤년 아님';
		END
GO

EXEC main2_3 1900
=======
﻿
-- mssql
-- Q : ﻿2753번
-- C:\algo\Algorithm\mssql\src\backjoon
-- DROP PROC main2_3

CREATE PROC main2_3
	@input INT
AS
	IF((@input / 4 = 1 AND @input / 100 != 1) OR @input / 400 = 1)
		BEGIN
			PRINT '1';
		END
	ELSE
		BEGIN
			PRINT '0';
		END
			
GO

EXEC main2_3 2020
>>>>>>> ca5f61c4e005d6c58002e90414797f7271ff9612
