package be.intecbrussel;

public class RectangleApplication {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(-8,-5, 0, 1);
        System.out.println("Rectangle1 area: " + rect1.getArea());


        Rectangle rect2 = new Rectangle(4,7, 2,5);
        System.out.println("Rectangle2 Width: " + rect2.getWidth() + " Height: " + rect2.getHeight() + " PosX: " + rect2.getX() + " PosY: " + rect2.getY());


        Rectangle rect3 = new Rectangle(rect1);
        System.out.println("Rectangle3 Width: " + rect3.getWidth() + " Height: " + rect3.getHeight() + " PosX: " + rect3.getX() + " PosY: " + rect3.getY());

        System.out.println("Amount of angles: " + Rectangle.Angles);
        System.out.println("Amount of objects: " + Rectangle.getCount());

    }
}
