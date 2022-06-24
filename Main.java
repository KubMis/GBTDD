package com.company.Kuba;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        GradeBook gradeBook= new GradeBook();
        BigDecimal Mark=BigDecimal.ZERO;
        gradeBook.addMark(Mark);
       // gradeBook.averageMark(Mark);
        gradeBook.seeMarks();

    }
}
