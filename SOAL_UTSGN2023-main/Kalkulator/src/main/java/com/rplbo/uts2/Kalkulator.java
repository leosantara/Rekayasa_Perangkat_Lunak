package com.rplbo.uts2;

public class Kalkulator {
    //atribut
    private int bil2;
    private int bil1;
    private String op;


    public Kalkulator(BilanganString b1,BilanganString b2,Operator op){
        bil1 = b1.getBilangan();
        bil2 = b2.getBilangan();
        this.op = op.getOperatorSimbol();

    }

    public void hitung(){
        double hasil = 0;
        if (this.op.equals("+")){
            hasil = bil1 + bil2;
        }else if (this.op.equals("-")) {
            hasil = bil1 - bil2;
        }else if(this.op.equals("*")) {
            hasil = bil1 * bil2;
        }else if(this.op.equals("/")) {
            hasil = bil1 / bil2;
        }else if(this.op.equals("^")){
            hasil = Math.pow(bil1,bil2);}
        System.out.println("Hasil: "+ hasil );
    }
}
