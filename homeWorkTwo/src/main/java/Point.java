public class Point {
    public int x = 0;
    public int y = 0;

    // Default Constructor (Exercise 3 modification needed here)
    public Point() {
        // Automatically provided if none defined
        this(0); //E3Q2
    }

    // Two-argument constructor
    public Point(int x, int y) {
        // Shadowing resolution used here
        this.x = x;
        this.y = y;
    }

    public Point(int size) { //E3Q1
        this.x = size;
        this.y = size;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void printState() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

}
