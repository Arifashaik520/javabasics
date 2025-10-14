package com.tnsif.interfaces;

public interface printable {
	void print();
}
interface Showable {
    void show();
}

interface Drawable {
    void draw();
}

interface Playable {
    void play();
}

class Demo implements printable, Showable, Drawable, Playable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public void draw() {
        System.out.println("Drawing...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}