package com.rplbo.uts1;

public class Main {
    public static void main(String[] args) {
        Titik a = new Titik(1,1);
        Titik b = new Titik(1,5);
        double hasil = a.distance(b);

        Garis g1 = new Garis(a,b);
        Garis g2 = new Garis(b,a);
        g1.apakahPanjangSama(g2);

        SegiEmpat sg = new SegiEmpat(new Titik(1,1),new Titik(5,1), new Titik(5,6), new Titik(1,6));

    }
}
