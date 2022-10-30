package com.ashiq.main.model;

import javax.annotation.PreDestroy;

public class Computer {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Computer() {
		super();
		System.out.println("No - arg construtor - From Computer");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("All - arg construtor - From Coder");
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + "]";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Computer object destroyed");
	}
}
