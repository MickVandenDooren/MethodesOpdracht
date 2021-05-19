package be.intecbrussel;

public class Rectangle {

    private static int count =0;
    public static final int Angles = 4;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        count++;
    }
    public Rectangle(int width, int height, int x, int y){
        this.width = width<0?-width:width;
        this.height = height<0?-height:height;
        this.x = x;
        this.y = y;
        count ++;
    }

    public Rectangle(Rectangle rect1){
        count ++;
    }

    public Rectangle (){
        this(0,0,0,0);
        count ++;
    }

    private int x;
    private int y;
    private int width;
    private int height;


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

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width<0?-width:width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height) {
        this.height = height<0?-height:height;
    }

    public void setPosition(int xpos, int ypos){
        this.x = xpos;
        this.y = ypos;
    }

    public int getArea(){
        return width * height;
    }

    public int getPerimeter(){
        return width + height * 2;
    }

    public void grow(int d){
        d = d<0?-d:d;
        this.height+=d;
        this.width+=d;
    }

    public static int getCount(){
        return count;
    }

}

