package dev.symoh;

import java.util.Random;

public class binaryCalculator extends regularCalculator{
    //variables
    public int x, y;//variable for setters and getters
    private int d1,d2;//hold converted binary to decimal in various methods
    private int op;//store results in decimal after computation in various methods
    private int bin;//holds converted decimal to binary value in various methods

    //converts binary to decimal
    public int binaryToDecimal(int binaryValue){
        String bin = String.valueOf(binaryValue);
        int power = 1, decimal = 0;
        for (int i = 0; i < bin.length(); i++) {
            decimal = ((bin.charAt(bin.length()-1-i) - '0') * power)+decimal;
            power =power * 2;
        }
        return decimal;
    }

    //converts decimal to binary
    public int decimalToBinary(int decimalValue){
        String binary="";
        while (decimalValue>0){
            binary=(decimalValue%2)+binary;
            decimalValue=(decimalValue/2);
        }
        int dec= Integer.parseInt(binary);
        return dec;
    }

    //calculates sum of two binary numbers
    public int sum() {
        //get first value
        d1=getX();
        //get second value
        d2=getY();
        //convert binary to decimal
        d1=binaryToDecimal(getX());
        d2=binaryToDecimal(getY());
        //create an instance of regular calculator and sets the value
        regularCalculator regularCalculator=new regularCalculator();
        regularCalculator.setX(d1);
        regularCalculator.setY(d2);
        op=regularCalculator.sum();
        //convert back to binary and return
        bin=decimalToBinary(op);
        return bin;
    }

    //calculates subtraction of two binary numbers
    public int subtract() {
        //get first value
        d1=getX();
        //get second value
        d2=getY();
        //convert binary to decimal
        d1=binaryToDecimal(getX());
        d2=binaryToDecimal(getY());
        //create an instance of regular calculator and sets the value
        regularCalculator regularCalculator=new regularCalculator();
        regularCalculator.setX(d1);
        regularCalculator.setY(d2);
        op=regularCalculator.subtract();
        //convert back to binary and return
        bin=decimalToBinary(op);
        return bin;
    }

    //calculates multiplication of two binary numbers
    public int multiply() {
        //get first value
        d1=getX();
        //get second value
        d2=getY();
        //convert binary to decimal
        d1=binaryToDecimal(getX());
        d2=binaryToDecimal(getY());
        //create an instance of regular calculator and sets the value
        regularCalculator regularCalculator=new regularCalculator();
        regularCalculator.setX(d1);
        regularCalculator.setY(d2);
        op=regularCalculator.multiply();
        //convert back to binary and return
        bin=decimalToBinary(op);
        return bin;
    }

    //calculates division of two binary numbers
    public int divide() {
        //get first value
        d1=getX();
        //get second value
        d2=getY();
        //convert binary to decimal
        d1=binaryToDecimal(getX());
        d2=binaryToDecimal(getY());
        //create an instance of regular calculator and sets the value
        regularCalculator regularCalculator=new regularCalculator();
        regularCalculator.setX(d1);
        regularCalculator.setY(d2);
        op=regularCalculator.divide();
        //convert back to binary and return
        bin=decimalToBinary(op);
        return bin;
    }
    //gets set first value
    public int getX() {
        return x;
    }

    //sets first value
    public void setX(int x) {
        this.x = x;
    }

    //gets set second value
    public int getY() {
        return y;
    }

    //sets first value
    public void setY(int y) {
        this.y = y;
    }
}
