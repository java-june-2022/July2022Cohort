package com.codingdojo.bird;

import com.codingdojo.animal.Animal;
import com.codingdojo.interfaces.Fly;
import com.codingdojo.interfaces.Swim;

public class Bird extends Animal implements Fly, Swim {
	
	public Bird(String species,int height, int width) {
		super(species, 1, 10, false, true, true);
	}
	
	public void fly() {
		System.out.println("I believe I can fly!");
	}
	
	public void swim() {
		if (this.getSpecies() == "Pelican") {
			System.out.println("Just keep swimming~");
		} else {
			System.out.println("You are not a swimming bird!");
		}
	}
}
