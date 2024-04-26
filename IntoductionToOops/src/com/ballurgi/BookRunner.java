package com.ballurgi;

public class BookRunner {

	public static void main(String[] args) {

		Book effectiveJava = new Book();

		effectiveJava.setNumberOfCopies(2000);

		System.out.println(effectiveJava.getNumberOfCopies());
	}

}
