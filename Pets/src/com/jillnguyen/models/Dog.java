package com.jillnguyen.models;

public class Dog extends Animal{

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	@Override
	public String showAffection() {
		if (this.weight < 5) {
			return name + " hops on your lap and cuddles you";
		} else if ( 5 < this.weight && this.weight < 15) {
			return name + " goes around and happily wags tails to catch your attention";
		} else {
			return name + " runs to you";
		}
	}
	
}
