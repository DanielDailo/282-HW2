public class Microwave extends Device { //E4Q2

    public int maxTime; //E4Q3

    public Microwave(int startPower, int maxCookingTime) {  //E4Q4
        super(startPower); //E4Q5
        powerLevel = startPower;
    }
    public void printDescription() { //E6Q1
        super.printDescription(); //E6Q2
        System.out.println("Max Cooking Time: " + maxTime); //E6Q3
    }

    public void heatFood() {
        System.out.println("Food is heating."); //E8Q1
    }
}
