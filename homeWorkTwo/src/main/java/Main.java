import static java.nio.file.Files.move;

public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    public static void resetPoint(Point p){
        p.move(0,1); // affects original value outside of method
        p.printState();

        p = new Point(0,0); // does not affect original value outside of method
        p.printState();
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int noOfCoords = points.length; //E5Q2
        int sum = 0;
        for  (int i = 0; i < noOfCoords; i++) {
            sum += points[i].x;
        }
        return sum; //E5Q1
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---

        System.out.println("Hello World!");

        Point startPoint; //E1Q1 declaration

        startPoint = new Point(10,20); //E1Q2 instantiation

        System.out.println(startPoint.x); //E1Q3 access

        startPoint.move(5,-3); //E1Q4 move
        startPoint.printState();

        int originalValue = 50; //E2Q1

        attemptToChangePrimitive(originalValue); //E2Q2

        System.out.println(originalValue); //E2Q3 only the val int data inside the method is changed,
                                           // the originalValue variable is only copied for its value
        Point refPoint = startPoint;       //E2Q4
        refPoint.printState();
        resetPoint(refPoint);
        refPoint.printState();

        Point ex3 = new Point(); //E3Q3
        ex3.printState();

        int results = 0; //E5Q3
        results = sumCoordinates(startPoint, refPoint, ex3);
        System.out.println("Sum of x coordinates: " + results);
        results = sumCoordinates(new Point(1,2),new Point(3,4),new Point(5,6));
        System.out.println("Sum of x coordinates: " + results);

        Device d1 = new Device(0); //E7Q1
        Microwave m1 = new Microwave(0,0);
        Device polyDevice; //E7Q2
        polyDevice = m1; //E7Q3
        polyDevice.printDescription(); //E7Q4 executes device and then the microwave's implementation as it is referenced

        if (obj instanceof polyDevice) { // Checks type safely
            Device polyDevice = m1;
            polyDevice.heatFood(); //E8Q2

        }
    }

}
