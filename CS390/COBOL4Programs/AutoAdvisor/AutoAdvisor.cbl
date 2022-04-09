		>>SOURCE FORMAT FREE
IDENTIFICATION DIVISION.
PROGRAM-ID. AutoAdvisor.
Author. Ryan Custard.
DATE-WRITTEN.September 26th 2020

ENVIRONMENT DIVISION.
INPUT-OUTPUT SECTION.
	FILE-CONTROL.
		SELECT IN-FILE ASSIGN TO Path
			ORGANIZATION IS LINE SEQUENTIAL.
			

DATA DIVISION.

FILE SECTION.

FD IN-FILE.
	01 Fsdata PIC X(100).


WORKING-STORAGE SECTION.
01 Fsdata             PIC X(100).
01 Path		          PIC X(30).
01 GPA	              PIC 9(3)V99 VALUE ZEROS.
01 CreditR            PIC 9(2) VALUE ZEROS.
01 WSdata             PIC X(100).
01 classT             PIC 9(3) VALUE ZEROS.
01 CreditT            PIC 9(2) VALUE ZEROS.
01 Course             PIC X(30).
01 Hour               PIC 9 VALUE ZEROS.
01 Prereqs            PIC X(30) OCCURS 7 TIMES.
01 Grade              PIC X(1).
01 Rough              PIC X(100). 
01 Counter            PIC 99 VALUE 1.		
01 TCourse            PIC X(30) OCCURS 37 TIMES.
01 FormatGPA          PIC 9V99.
01 While              PIC 9 VALUE 0.
01 While2             PIC 9 VALUE 1.
01 Preset             PIC X(20) Value "NULL".
01 Bool               PIC A(1) VALUE 'f'. 
01 Met                PIC A(1) VALUE 'T'. 
01 NCourse            PIC X(30) OCCURS 36 TIMES.
01 CanCount           PIC 99 VALUE 1.
01 CanTake            PIC X(30) OCCURS 36 TIMES.
01 WSEOF              PIC A(1).


	
PROCEDURE DIVISION.
DISPLAY "Please enter the name of the file."
ACCEPT Path

PERFORM UNTIL Counter = 37
	MOVE Preset TO TCourse(Counter)
	MOVE Preset TO CanTake(Counter)
	COMPUTE Counter = Counter + 1
END-PERFORM
COMPUTE Counter = 1.


OPEN INPUT IN-FILE.
		PERFORM UNTIL WSEOF = 'Y'
		
			READ IN-FILE into WSdata
			AT END MOVE 'Y' TO WSEOF
		    END-READ
			
			UNSTRING WSdata DELIMITED BY '|'
			INTO Course, Hour, Rough, Grade

			MOVE "empt" to Prereqs(1)

			UNSTRING Rough DELIMITED BY ',' OR SPACE
			INTO Prereqs(1), Prereqs(2), Prereqs(3), Prereqs(4), Prereqs(5), Prereqs(6), Prereqs(7)
			
			
			IF Grade = 'A' THEN 
				COMPUTE GPA = GPA + 4.0 * Hour
				COMPUTE classT = classT + 1
				COMPUTE CreditT = CreditT + Hour
				UNSTRING Course
				INTO TCourse(Counter)
				COMPUTE Counter = Counter + 1
				
			ELSE IF Grade = 'B' THEN 
				COMPUTE GPA = GPA + 3.0 * Hour
				COMPUTE classT = classT + 1
				COMPUTE CreditT = CreditT + Hour
				UNSTRING Course
				INTO TCourse(Counter)
				COMPUTE Counter = Counter + 1
				
				
			ELSE IF Grade = 'C' THEN
				COMPUTE GPA = GPA + 2.0 * Hour
				COMPUTE classT = classT + 1
				COMPUTE CreditT = CreditT + Hour
				UNSTRING Course
				INTO TCourse(Counter)
				COMPUTE Counter = Counter + 1
				
			ELSE IF Grade = 'D' THEN
				COMPUTE GPA = GPA + 1.0 * Hour
				COMPUTE classT = classT + 1
				COMPUTE CreditT = CreditT + Hour
				UNSTRING Course
				INTO TCourse(Counter)
				COMPUTE Counter = Counter + 1
				
			ELSE IF Grade = 'F' THEN
				COMPUTE classT = classT + 1
				
			ELSE
				COMPUTE CreditR = CreditR + Hour
				PERFORM UNTIL While2 = 8

						IF Prereqs(1) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF
						
						IF Prereqs(2) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF
						
						IF Prereqs(3) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF
						
						IF Prereqs(4) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF
						
						IF Prereqs(5) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF

						IF Prereqs(6) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF
						
						IF Prereqs(7) = TCourse(While2)
						MOVE 't' TO Bool
						END-IF
						
						COMPUTE While2 = While2 + 1
	
				END-PERFORM
				COMPUTE While2 = 0
				IF Bool = 't' OR Prereqs(1) = "empt"
					MOVE Course TO CanTake(CanCount)
					COMPUTE CanCount = CanCount + 1
					MOVE 'f' to Bool
				END-IF
				
			END-IF

			
			
			
		END-PERFORM

CLOSE IN-FILE.

DISPLAY "File name:         " Path
COMPUTE FormatGPA = GPA / CreditT
DISPLAY "GPA:               " FormatGPA
DISPLAY "Hours Attempted:   " CreditT
DISPLAY "Hours Completed:   " CreditT
DISPLAY "Credits Remaining: " CreditR
DISPLAY" "
DISPLAY"Possible courses to take next"
MOVE 0 TO CanCount
PERFORM UNTIL CanTake(CanCount) = "NULL"
		DISPLAY CanTake(CanCount)
		COMPUTE CanCount = CanCount + 1
	END-PERFORM



	
STOP RUN.
