class Cylinder {
    private double radius;
    private double height;

    Cylinder() {
        radius = 1.0;
        height = 1.0;
    }

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    Rectangle() {
        length = 4;
        breadth = 5;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(3.0);
        c1.setHeight(5.0);
        System.out.println("Cylinder using setters:");
        System.out.println("Surface Area: " + c1.surfaceArea());
        System.out.println("Volume: " + c1.volume());

        Cylinder c2 = new Cylinder(7.0, 10.0);
        System.out.println("\nCylinder using constructor:");
        System.out.println("Surface Area: " + c2.surfaceArea());
        System.out.println("Volume: " + c2.volume());

        Rectangle r1 = new Rectangle();
        System.out.println("\nRectangle with default constructor:");
        r1.display();

        Rectangle r2 = new Rectangle(8, 12);
        System.out.println("\nRectangle with overloaded constructor:");
        r2.display();
    }
}
