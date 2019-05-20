package util;

public class Size {

    private double width;
    private double height;

    public Size(){
        width = 0;
        height = 0;
    }

    public Size(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

}