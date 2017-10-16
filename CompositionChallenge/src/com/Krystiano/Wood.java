package com.Krystiano;

public class Wood {
    private String tree;
    private String colour;

    public Wood(String tree, String colour) {
        System.out.println("New wood created");
        this.tree = tree;
        this.colour = colour;
    }

    public String getTree() {
        return tree;
    }

    public String getColour() {
        return colour;
    }
}
