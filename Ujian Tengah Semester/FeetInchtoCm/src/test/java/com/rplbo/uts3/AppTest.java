package com.rplbo.uts3;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import java.util.stream.Stream;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testFeetToInch(){
        Main f = new Main();
        assertEquals(38.1, f.FeetIncToCm(1,3),0);
        assertEquals(38.1, f.FeetIncToCm(15),0);
    }

    @Test
    public void testOperator(){

    }

    @Test
    public void testKalkulator(){


    }

    @Test
    public void testKalkulator2(){

    }
}
