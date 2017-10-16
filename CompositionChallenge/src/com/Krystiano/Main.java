package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        Wood pine = new Wood("pine", "dark brown");
	    Shelf shelfOne = new Shelf("TurboOne", "Custom", 10, pine );
	    Wood apple = new Wood("apple", "light brown");
	    Table table = new Table(apple, 4);
	    Bulb theBulb = new Bulb(100, 27);
	    Lamp lamp = new Lamp(theBulb,"pink", "Osram");

	    Room myRoom = new Room(shelfOne,table, lamp);
	    myRoom.lightOn();
		System.out.println(myRoom.getTable().getWood().getTree());
		lamp.describeMe();
    }
}
