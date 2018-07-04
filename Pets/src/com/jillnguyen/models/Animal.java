package com.jillnguyen.models;

public class Animal implements Pet{
	protected String name;
	protected String breed;
	protected int weight;
	
	public Animal(String nameParam, String breedParam, int weightParam) {
		name = nameParam;
		breed = breedParam;
		weight = weightParam;
	}
	
	public String showAffection() {
		return this.name + " is looking at you for affection.";
	}
		
	
	
}
