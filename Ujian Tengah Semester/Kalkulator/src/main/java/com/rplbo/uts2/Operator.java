package com.rplbo.uts2;

public class Operator {
    //Atribut
    private String operatorString;
    private String operatorSimbol;

    public Operator(String op){
        String operatorlower;
        operatorlower = op.toLowerCase();
        if (operatorlower.equals("tambah")){
            operatorSimbol = "+";
        }else if (operatorlower.equals("kurang")) {
            operatorSimbol = "-";
        }else if (operatorlower.equals("kali")) {
            operatorSimbol = "*";
        }else if (operatorlower.equals("bagi")) {
            operatorSimbol = "/";
        }else if (operatorlower.equals("pangkat")) {
            operatorSimbol = "^";}
    }

    public String getOperatorSimbol(){
        return operatorSimbol;
    }
}
