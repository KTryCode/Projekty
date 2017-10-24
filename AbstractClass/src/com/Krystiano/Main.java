package com.Krystiano;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Reksio");
	    dog.breathe();
	    dog.eat();
	    Parrot parrot = new Parrot("Papaj");
	    parrot.breathe();
	    parrot.eat();
	    parrot.fly();
	    Penguin penguin = new Penguin("Frozie");
	    penguin.fly();
    }
}
