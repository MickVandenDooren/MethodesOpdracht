package be.intecbrussel;

public class Circle {

    private static int count =0;
    public static final int Angles = 0;

    public Circle(){
    }

    public Circle(int radius){
        this.radius = radius;
        count++;
    }
    public Circle(int radius, int x, int y){
        this.radius = radius<0?-radius:radius;
        this.x = x;
        this.y = y;
        count ++;
    }



    private int x;
    private int y;
    private int radius;


    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius<0?-radius:radius;
    }


    public void setPosition(int xpos, int ypos){
        this.x = xpos;
        this.y = ypos;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    public void grow(int d){
        d = d<0?-d:d;
        this.radius+=d;
    }

    public static int getCount(){
        return count;
    }

}
