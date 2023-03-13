package com.GL.javafsd.emailapplicationtest;

import com.GL.javafsd.emailapplication.PasswordGenerator;

public class PasswordGeneratorTest {

	public static void main(String[] args) {

		PasswordGenerator generator = new PasswordGenerator();

		String password = generator.generate();

		System.out.println("Generated password ->" + password);
	}
}