stuName = readEntry("Enter Student's Name: ");
#sql iterator Grades (
    char grade
);

Grades grades;

try {
    grades = #sql(
        SELECT gr.Grade 
        INTO grade
        FROM GRADE_REPORT gr, STUDENT stu
        WHERE stu.Name = stuName AND gr.Student_number = stu.Student_number
    );

    while (grades.hasNext()) {
        grades.next();
        switch (grades.grade) {
            case 'A':
                gpa += 4.0;
                break;
            case 'B':
                gpa += 3.0;
                break;
            case 'C':
                gpa += 2.0;
                break;
            case 'D':
                gpa += 1.0;
                break
        }
        numGrades++;
    }

    System.out.println(stuName + " GPA: " + gpa / numGrades)
}
catch (Exception e) {
    System.out.println("Error: " + e);
}

