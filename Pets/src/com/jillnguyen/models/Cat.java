package com.jillnguyen.models;

public class Cat extends Animal{

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		return this.name + " slowly close eyes in front of you";
	}

}
