package com.learning.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person person = new Person();
		assertEquals("Jim", person.getName());
		assertEquals(10, person.getMaxBooks());
	}

	@Test
	void testSetName() {
		Person person = new Person();
		person.setName("Fred");
		assertEquals("Fred", person.getName());
	}

	@Test
	void testSetMaxBooks() {
		Person person = new Person();
		person.setMaxBooks(14);
		assertEquals(14, person.getMaxBooks());
	}

	@Test
	void testToString() {
		Person person = new Person();
		person.setName("Fred Beans");
		person.setMaxBooks(10);
		String testString = "Fred Beans (10 books)";
		assertEquals(testString, person.toString());
	}

	@Test
	void testSetMinBooks() {
		Person person = new Person();
		person.setMinBooks(2);
		assertEquals(2, person.getMinBooks());
	}

	@Test
	void testSetHomeAddress() {
		Person person = new Person();
		person.setAddress("Beauvale Road");
		String testAddress = "Beauvale Road";
		assertEquals(testAddress, person.getAddress());
	}

	@Test
	void testMinFine() {
		Person person = new Person();
		person.setMinFine(1.45);
		assertEquals(1.45, person.getMinFine());
	}

	@Test
	void testMaxFineIsMinFineMultipliedByMaxBooks() {
		Person person = new Person();
		person.getMaxBooks();
		double testCalc = person.getMinFine() * person.getMaxBooks();
		assertEquals(testCalc, person.MaxFine());
	}

}
