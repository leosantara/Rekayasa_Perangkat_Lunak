package com.rplbo.uts2;
import java.util.HashMap;

public class BilanganString {
    //atribut
    private String bilanganstring;
    private int bilangan;

    private HashMap<String, Integer> convert = new HashMap<>() {
        {
            put("satu", 1);
            put("dua", 2);
            put("tiga", 3);
            put("empat", 4);
            put("lima", 5);
            put("enam", 6);
            put("tujuh", 7);
            put("delapan", 8);
            put("sembilan", 9);
            put("sepuluh", 10);
            put("sebelas", 11);
            put("belas", 1);
            put("puluh", 0);

        }
    };

    public int getBilangan(){
        return bilangan;
    }

    public boolean apakahLebihDari10(){
        if (bilangan > 9){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean apakahDuaDigit(){
        if (bilangan > 9){
            return true;
        }
        else {
            return false;
        }
    }

    public BilanganString(String kalimat){
        String bilanganstringawal;
        bilanganstringawal = kalimat.toLowerCase();

        String[] hasilSplit = bilanganstringawal.split( " ");


        if (hasilSplit.length == 1){
            bilanganstring = Integer.toString(convert.get(hasilSplit[0]));
        }
        else if (hasilSplit.length == 2){
            bilanganstring = Integer.toString(convert.get(hasilSplit[1]))+Integer.toString(convert.get(hasilSplit[0]));
        };
        bilangan = Integer.parseInt(bilanganstring);


    }
}
