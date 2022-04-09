       >>SOURCE FORMAT FREE
IDENTIFICATION DIVISION.
       PROGRAM-ID.     quickstart.
       AUTHOR.         Sean Poston.
       DATE-WRITTEN.   September 27nd 2020.
ENVIRONMENT DIVISION.
DATA DIVISION.
WORKING-STORAGE SECTION.
       01 LIST.
           02 ARRAYINDEX PIC 9(3) OCCURS 10 TIMES.
       01 SORTVARS.
           02 I            PIC 9(2).
           02 USERINPUT    PIC 9(2).
           02 FIRST1       PIC 9(2) VALUE 1.
           02 LAST1        PIC 9(2) VALUE 10. 
       01 PARTITIONVARS.
           02 PIVOT        PIC 9(2).
           02 LOW1         PIC 9(2).
           02 HIGH1        PIC 9(2).
       01 SWAPVARS.
           02 TEMP         PIC 9(2).
           02 INDEXA       PIC 9(2).
           02 INDEXB       PIC 9(2).
       01 RETURNVARS.
           02 PIVOTINDEX   PIC 9(2).
       

PROCEDURE DIVISION.
       DISPLAY "HEY"
      *> PROMPT USER TO ENTER 10 VALUES 
       PERFORM VARYING I FROM 1 BY 1 UNTIL I > 10
           DISPLAY "ENTER NUM " I ": " WITH NO ADVANCING
           ACCEPT ARRAYINDEX(I)
       END-PERFORM.
       
      *> PRINT ENTERED VALUES
       DISPLAY " ".
       DISPLAY "Presorted Array:".
       PERFORM printArray.

      *> RUN QUICKSORT
       CALL 'quicksortfunc' USING LIST, SORTVARS,  PARTITIONVARS, SWAPVARS, RETURNVARS.

      *> PRINT SORTED VALUES
       DISPLAY " ".
       DISPLAY "Sorted Array:".
       PERFORM printArray2.

printArray.
       PERFORM VARYING I FROM 1 BY 1 UNTIL I > 10
           DISPLAY ARRAYINDEX(I)
       END-PERFORM.

printArray2.
       PERFORM VARYING I FROM 1 BY 1 UNTIL I > 10
           DISPLAY ARRAYINDEX(I)
       END-PERFORM.
      *>END OF PROGRAM
STOP RUN.
