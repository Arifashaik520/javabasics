package com.tnsif.interfaces;

public interface Animal 
    {
	    void eat();
	}

	// Child interface extending parent interface
interface Pet extends Animal
	{
	    void play();
	}

	// Class implementing child interface
class Dog implements Pet 
	{
	    public void eat() 
	    {
	        System.out.println("Dog is eating...");
	    }

	    public void play()
	    {
	        System.out.println("Dog is playing...");
	    }
	}

