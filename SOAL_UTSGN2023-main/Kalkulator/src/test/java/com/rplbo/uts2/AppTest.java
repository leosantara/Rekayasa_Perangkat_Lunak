package com.rplbo.uts2;
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
    public void testBilanganString(){
        BilanganString b1 = new BilanganString("DuA BelaS");
        BilanganString b2 = new BilanganString("tiga BELAS");
        BilanganString b3 = new BilanganString("DELapaN");
        assertTrue(b1.apakahDuaDigit());
        assertTrue(b2.apakahDuaDigit());
        assertTrue(b1.apakahLebihDari10());
        assertTrue(b2.apakahLebihDari10());
        assertFalse(b3.apakahDuaDigit());
        assertFalse(b3.apakahLebihDari10());
    }

    @Test
    public void testOperator(){
        Operator op = new Operator("TaMbah");
        Operator op2 = new Operator("kali");
        Operator op3 = new Operator("pangkat");
        assertEquals("+",op.getOperatorSimbol());
        assertEquals("*",op2.getOperatorSimbol());
        assertEquals("^",op3.getOperatorSimbol());
    }

    @Test
    public void testKalkulator(){
        BilanganString b1 = new BilanganString("DuA BelaS");
        BilanganString b2 = new BilanganString("tiga BELAS");
        Operator op = new Operator("TaMbah");
        Kalkulator k = new Kalkulator(b1,b2,op);
        k.hitung();
        assertEquals("Hasil: 25.0",
                outputStreamCaptor.toString().trim());

    }

    @Test
    public void testKalkulator2(){
        Kalkulator k2 = new Kalkulator(new BilanganString("dua"),new BilanganString("tiga"),new Operator("pangkat"));
        k2.hitung();
        assertEquals("Hasil: 8.0",
                outputStreamCaptor.toString().trim());
    }
}
