package com.qa.day1;

public class Results {
	public static void method1(double x, double y, double z) {
		double physics = x;
		double biology = y;
		double chemistry = z;
		double total = x + y + z;
		System.out.println("Mark achieved for chemistry was " + physics + " out of 150.");
		System.out.println("Mark achieved for chemistry was " + biology + " out of 150.");
		System.out.println("Mark achieved for chemistry was " + chemistry + " out of 150.");
		System.out.println("Total mark was " + total + " out of 450.");
	}

	public static void method2(float x, float y, float z) {
		float total = x + y + z;
		float percentage = (total * 100) / 450;
		System.out.println("The percentage mark overall scored was " + percentage + "%.");
	}
}