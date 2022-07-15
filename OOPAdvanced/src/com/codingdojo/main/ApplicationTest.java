package com.codingdojo.main;
import com.codingdojo.bird.Bird;
import com.codingdojo.dog.Dog;

public class ApplicationTest {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Dog dog = new Dog(4, 50, 12);
		dog.run();
		
		Bird birb = new Bird("Eagle", 5, 40);
		Bird swimBirb = new Bird("Pelican", 5, 40);
		birb.swim();
		swimBirb.swim();
	}
}
