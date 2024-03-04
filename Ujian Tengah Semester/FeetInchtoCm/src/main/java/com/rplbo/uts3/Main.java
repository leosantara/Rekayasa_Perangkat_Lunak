package com.rplbo.uts3;

public class Main {
    public static void main(String[] args) {

    }

    public double FeetIncToCm(double feet, double inches) {
        if (feet <= 0 || inches <= 0 || inches >= 12) {
            return -1;
        }
        double totalInches = (feet * 12) + inches;
        return totalInches * 2.54;
    }

    public double FeetIncToCm(int inches) {
        if (inches <= 0) {
            return -1;
        }
        double feet = inches / 12;
        double remainingInches = inches % 12;
        return FeetIncToCm(feet, remainingInches);
    }

}

