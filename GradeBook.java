package com.company.Kuba;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class GradeBook {


    final String e = "Average cannot be negative";
    final String e2 = "Average is higher than 5.00 , the Marks are incorrect";
    final String e3 = "Marks must be numbers";
    final BigDecimal NUMBER_OF_SUBJECTS= new BigDecimal(3);



    Subject Math = new Subject(BigDecimal.valueOf(0));
    Subject English = new Subject(BigDecimal.valueOf(0));
    Subject Geography = new Subject(BigDecimal.valueOf(0));


    public BigDecimal averageMark(BigDecimal averageM) {


        averageM=averageM.add(Math.grade).add(Geography.grade).add(English.grade);



        averageM= averageM.divide(NUMBER_OF_SUBJECTS ,2 , RoundingMode.HALF_EVEN);
        if (averageM.compareTo(BigDecimal.valueOf(5)) == 1) throw new IllegalArgumentException(e2);
        if (averageM.compareTo(BigDecimal.valueOf(0)) == -1) throw new IllegalArgumentException(e);


        System.out.println("Average is " + averageM);

        return averageM;
    }

    public void addStudent(String name, Integer id) {
        Scanner sc = new Scanner(System.in);
        name = sc.next();

        id = sc.nextInt();
        if (!sc.hasNextInt() & id >= 0) {
            throw new IllegalArgumentException("Id is not int or is negative");
        } else {
            Student student = new Student(name, id);
        }
    }

    public void addMark(BigDecimal Mark) {

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextBigDecimal()) {
            Mark = sc.nextBigDecimal();
            Math.grade = Math.grade.add(Mark);
        }
        else throw new IllegalArgumentException(e3);
        if (sc.hasNextBigDecimal()) {
            Mark = sc.nextBigDecimal();
            English.grade = English.grade.add(Mark);
        }
        else throw new IllegalArgumentException(e3);
        if (sc.hasNextBigDecimal()) {
            Mark = sc.nextBigDecimal();
            Geography.grade = Geography.grade.add(Mark);
        }
        else throw new IllegalArgumentException(e3);
    }



    public void seeMarks(){
        System.out.println(Math.grade +" Math grade");
        System.out.println(English.grade +" English grade");
        System.out.println(Geography.grade + " Geography grade");
    }


}