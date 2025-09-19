package com.tnsif.interfaces;

public interface printable {
	void print();
}
interface Showable {
    void show();
}

// A class implementing multiple interfaces
class Demo implements printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

