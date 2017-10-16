package com.Krystiano;

public class Shelf {
    private String model;
    private String type;
    private int capacity;
    private Wood wood;

    public Shelf(String model, String type, int capacity, Wood wood) {
        System.out.println("Shelf created");
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.wood = wood;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Wood getWood() {
        return wood;
    }
}
