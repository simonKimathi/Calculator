package dev.symoh;

public class regularCalculator {
    public int x,y; //variable for setters and getters
    //default constructor
    public regularCalculator() {

    }
    //gets set first value
    public int getX() {
        return x;
    }
    //sets the first value
    public void setX(int x) {
        this.x = x;
    }
    //gets the set second value
    public int getY() {
        return y;
    }
    //sets the second value
    public void setY(int y) {
        this.y = y;
    }
    //calculates addition of two decimal numbers
    public int sum(){
        return getX()+getY() ;
    }
    //calculates subtraction of two decimal numbers
    public int subtract(){
        return getX()-getY() ;
    }
    //calculates multiplication of two decimal numbers
    public int multiply(){
        return getX()*getY() ;
    }
    //calculates division of two binary numbers
    public int divide(){
        return getX()/getY() ;
    }

}
