package util;

public class Vector {

    private double x;
    private double y;

    public Vector(){
        x = 0;
        y = 0;
    }

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v){
        x += v.x;
        y += v.y;
        return this;
    }

    public Vector multiply(double nbr){
        x *= nbr;
        y *= nbr;
        return this;
    }

    @Override
    public Vector clone(){
        return new Vector(x, y);
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString(){
        return String.format("X: %.4f, Y: %.4f", x, y);
    }

}
