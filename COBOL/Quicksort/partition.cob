       >>SOURCE FORMAT FREE
IDENTIFICATION DIVISION.
PROGRAM-ID. partition.
AUTHOR.     Sean Poston.
DATA DIVISION.
LINKAGE SECTION.
       01 LIST.
           02 ARRAYINDEX PIC 9(3) OCCURS 10 TIMES.
       01 SORTVARS.
           02 I            PIC 9(2).
           02 USERINPUT    PIC 9(2).
           02 FIRST1       PIC 9(2).
           02 LAST1        PIC 9(2). 
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

PROCEDURE DIVISION USING LIST, SORTVARS, PARTITIONVARS, SWAPVARS, RETURNVARS.
       MOVE ARRAYINDEX(FIRST1) TO PIVOT.
       COMPUTE LOW1 = FIRST1 + 1.
       MOVE LAST1 TO HIGH1.
       PERFORM UNTIL HIGH1 NOT > LOW1
           PERFORM UNTIL LOW1 > HIGH1 AND ARRAYINDEX(LOW1) > PIVOT
               ADD 1 TO LOW1
           END-PERFORM

           PERFORM UNTIL LOW1 > HIGH1 AND ARRAYINDEX(HIGH1) NOT > PIVOT
               SUBTRACT 1 FROM HIGH1
           END-PERFORM

           IF HIGH1 > LOW1 THEN
               MOVE HIGH1 TO INDEXA
               MOVE LOW1 TO INDEXB
               CALL 'swap' USING LIST, SWAPVARS
           END-IF
       END-PERFORM.

       PERFORM UNTIL HIGH1 NOT > FIRST1 AND ARRAYINDEX(HIGH1) < PIVOT
           SUBTRACT 1 FROM HIGH1
       END-PERFORM

       IF PIVOT > ARRAYINDEX(HIGH1) THEN
           MOVE ARRAYINDEX(HIGH1) TO ARRAYINDEX(FIRST1)
           MOVE PIVOT TO ARRAYINDEX(HIGH1)
           MOVE HIGH1 TO PIVOTINDEX
       ELSE
           MOVE FIRST1 TO PIVOTINDEX
       END-IF.


EXIT PROGRAM.