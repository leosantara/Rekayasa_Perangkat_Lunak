package com.rplbo.uts1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void testTitik(){
        Titik a = new Titik(1,1);
        assertEquals(1,a.getY());
        assertEquals(1,a.getY());
        assertEquals(4.0,a.distance(1,5),0);
        assertEquals(5.0,a.distance(new Titik(1,6)),0);
        assertEquals(0.0,a.distance(1,1),0);
    }

    @Test
    public void testGaris(){
        Garis g = new Garis(new Titik(1,1), new Titik(1,6));
        Garis g2 = new Garis(new Titik(5,6),1,6);
        Garis g3 = new Garis(5,1,new Titik(1,1));
        Garis g4 = new Garis(g);
        assertEquals(5.0,g.getPanjangGaris(),1);
        assertEquals(1.67,g.getPanjangSepertigaGaris(),2);
        assertEquals(4.0,g2.getPanjangGaris(),0);
        assertEquals(4.0,g3.getPanjangGaris(),0);
        assertEquals(1.33,g4.getPanjangSepertigaGaris(),2);
    }

    @Test
    public void testSegiEmpat(){
        SegiEmpat sg = new SegiEmpat(new Titik(1,1),new Titik(5,1), new Titik(5,6), new Titik(1,6));
        SegiEmpat sg2 = new SegiEmpat(new Garis(new Titik(1,1),new Titik(5,1)),new Garis(new Titik(5,1), new Titik(5,6)), new Garis(new Titik(5,6),new Titik(1,6)), new Garis(new Titik(1,6), new Titik(1,1)));
        SegiEmpat sg3 = new SegiEmpat(new Garis(new Titik(1,1),new Titik(5,1)),new Titik(5,6), new Titik(1,6));
        assertFalse(sg.apakahKotak());
        assertFalse(sg2.apakahKotak());
        assertEquals(20.0, sg.area(), 0);
        assertEquals(20.0, sg3.area(), 0);
    }
}
