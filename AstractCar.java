package xyz;

abstract class AbstractionCar {
    abstract void color(String c);
    abstract void type(String t);
    abstract void cost(int c);
    abstract void sittingcapacity(int s);
}

class Cars extends AbstractionCar {
    public void color(String c) {
        System.out.println("Color: " + c);
    }

    public void type(String t) {
        System.out.println("Type: " + t);
    }

    public void cost(int c) {
        System.out.println("Cost: " + c);
    }

    public void sittingcapacity(int s) {
        System.out.println("Sitting Capacity: " + s);
    }
}

public class AstractCar {
    public static void main(String[] args) {
        Cars ac = new Cars();
        ac.color("Blue");
        ac.type("Ford");
        ac.cost(2000000);
        ac.sittingcapacity(6);
    }
}
