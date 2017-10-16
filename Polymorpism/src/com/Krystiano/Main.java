package com.Krystiano;

class Car {
    private boolean engine;
    private int wheels;
    private String Name;
    private int cylinders;
    private double velocity;
    private int zajebistoscLevel = 201;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.wheels = 4;

        Name = name;
        if (cylinders > 1 && cylinders < 8) {
            this.cylinders = cylinders;
        } else {
            this.cylinders=4;
        }
        this.velocity = 0;
    }

    public void startEngine(){
        System.out.println("Car.startEngine() -> Brum");
    }
    public void accelerate(double finalVelocity){
        double accRate = 4.0;
        double time = (finalVelocity - this.velocity)/accRate;
        this.velocity = finalVelocity;
        System.out.println("Velocity " + this.velocity + " reached in " + time + " sec" );
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }
}
class Tank extends Car{

    public Tank() {
        super("Tank", 4);
    }

    public void accelerate(double finalVelocity){
        double accRate = 2.0;
        double time = (finalVelocity - getVelocity())/accRate;
        setVelocity(finalVelocity);
        System.out.println("Velocity " + getVelocity() + " reached in " + time + " sec" );
    }
}

class Maluch extends Car {
    public Maluch() {
        super("Maluch", 6);
    }
    private int zajebistoscLevel = 200;
    public void startEngine() {
        System.out.println("Maluch.startEngine() -> PyrPyrPyr");
    }

    public int getZajebistoscLevel() {
        return this.zajebistoscLevel;
    }
}

public class Main {

    public static void main(String[] args) {
	    Car vehicle1 = new Car("Porsche", 2);
	    Car vehicle2 = new Tank();
	    Car vehicle3= new Maluch();

	    vehicle1.startEngine();
	    vehicle1.accelerate(100);
	    vehicle1.accelerate(150);
	    vehicle2.startEngine();
        vehicle2.accelerate(100);
        vehicle3.startEngine();
        vehicle3.accelerate(100);
    }
}
