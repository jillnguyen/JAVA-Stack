package com.jillnguyen.models;

public interface Pet {
	default String showAffection() {
		return "is looking at you with affection";
	}
}
