package com.codingdojo.dog;
import com.codingdojo.animal.*;
public class Dog extends Animal {
	int tailLength;
	
	public Dog(int weight, int height, int tailLength) {
		super("Dog", height, weight, true, false, true);
		this.tailLength = tailLength;
		
	}
	
	public void bark() {
		System.out.println("Bork bork!");
	}
	
	@Override
	public void run() {
		System.out.println("The dog runs fast!");
		this.setStamina(this.getStamina() - 5); 
	}
}

	
