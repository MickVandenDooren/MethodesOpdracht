package be.intecbrussel;

public class CircleApplication {
    public static void main(String[] args) {


        Circle C1 = new Circle(5, 2, 1);
        System.out.println("Circle 1"+ "\n"+"Radius: " + C1.getRadius() + "\n" + "PosX: " + C1.getX() + " PosY: " + C1.getY());
        System.out.println("Area: " + C1.getArea());
        System.out.println("Perimeter: " + C1.getPerimeter());
        System.out.println("Amount of objects: "  + Circle.getCount());


    }
}
