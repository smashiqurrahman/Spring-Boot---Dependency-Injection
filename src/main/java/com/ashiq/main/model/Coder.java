package com.ashiq.main.model;

import javax.annotation.PreDestroy;

public class Coder {
	private int id;
	private String name;
	private String language;
	private Computer computer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Coder() {
		super();
	System.out.println("No - arg construtor - From Coder");
	}

	public Coder(int id, String name, String language, Computer computer) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.computer = computer;
		System.out.println("All - arg construtor - From Coder");
	}

	@Override
	public String toString() {
		return "Coder [id=" + id + ", name=" + name + ", language=" + language + ", computer=" + computer + "]";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Coder object destroyed");
	}
}
