package com.company.Kuba;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GradeBookTest {


    GradeBook gb= new GradeBook();

    @Test
 void shouldThrowException (){


        Throwable argumentException = assertThrows(IllegalArgumentException.class, ()->{gb.averageMark(BigDecimal.valueOf(-50));});
            assertEquals(argumentException.getMessage(), ("Average cannot be negative"));
    }

    @Test
    void shouldThrowException2 (){

        Throwable argumentException = assertThrows(IllegalArgumentException.class, ()->{gb.averageMark(BigDecimal.valueOf(15.1));});
        assertEquals(argumentException.getMessage(), ("Average is higher than 5.00 , the Marks are incorrect"));
    }

    @Test
    void shouldReturnZero(){
        assertEquals( BigDecimal.valueOf(0.00).setScale(2, RoundingMode.HALF_EVEN),gb.averageMark(BigDecimal.valueOf(0)));
    }

    @Test
    void shouldWork(){
        assertEquals(BigDecimal.valueOf(3.00).setScale(2, RoundingMode.HALF_EVEN) , gb.averageMark(BigDecimal.valueOf(9)));
    }



}