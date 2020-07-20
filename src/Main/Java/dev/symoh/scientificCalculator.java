package dev.symoh;

public class scientificCalculator{
    double x;
    //get set value
    public double getX() {
        return x;
    }
    //sets value
    public void setX(double x) {
        this.x = x;
    }
    //calculates factorial
    public double factorial(){
        double f=getX();
        double ans=1;
        for (double n=1;n<=f;n++){
            ans=ans*n;
        }
        return ans;
    }
    //calculates tan
    public double tan(){
        return Math.tan(getX());
    }
    //calculates sin
    public double sin(){
        return Math.sin(getX());
    }
    //calculates cos
    public double cos(){
        return Math.cos(getX());
    }
    //calculates log
    public double log(){
        return Math.log(getX());
    }
    //calculates square root
    public double sq(){
        return Math.pow(getX(),2);
    }
}
