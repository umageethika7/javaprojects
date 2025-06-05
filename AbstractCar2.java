package xyz;

abstract class Carss {
    abstract void start();
    abstract void drive();
    abstract void stop();

    void musicSystem() {
        System.out.println("playing music");
    }
}

class ConcreteCar extends Carss {
    void start() {
        System.out.println("car started using start button");
    }

    void drive() {
        System.out.println("car is driving");
    }

    void stop() {
        System.out.println("car is stopped using stop button");
    }
}

public class AbstractCar2 {
    public static void main(String[] args) {
        Carss ac2 = new ConcreteCar();
        ac2.start();
        ac2.musicSystem();
        ac2.drive();
        ac2.stop();
        
    }
}
