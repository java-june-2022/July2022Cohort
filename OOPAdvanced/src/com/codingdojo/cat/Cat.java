package com.codingdojo.cat;

import com.codingdojo.animal.Animal;

public class Cat extends Animal {
	private int tailLength;
	public Cat(int height, int weight, int tailLength) {
		// TODO Auto-generated constructor stub
		super("Cat",height, weight, true, false, true);
		this.tailLength = tailLength;
	}

}
