package com.learning.library;

public class Person {

	private String name;
	private int maxBooks;
	private int minBooks;
	private String Address;
	private double minFine;

	public Person() {
		this.name = "Jim";
		this.maxBooks = 10;
	}

	public double MaxFine() {
		return this.minFine * this.maxBooks;
	}

	public double getMinFine() {
		return minFine;
	}

	public void setMinFine(double minFine) {
		this.minFine = minFine;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}

	public String toString() {
		return this.name + " (" + this.getMaxBooks() + " books)";

	}

	public int getMinBooks() {
		return minBooks;
	}

	public void setMinBooks(int minBooks) {
		this.minBooks = minBooks;
	}

}
