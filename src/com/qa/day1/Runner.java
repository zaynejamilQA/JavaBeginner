package com.qa.day1;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Hello World");

		int age = 25;
		System.out.println(age);

		Hello.method1(" Zayne");
		// The hello.method1 uses a String requirement for the parameter hence the
		// "Zayne" in the brackets.

//////////////////////////////////////////////////////////////////////////////////

		// Variables are named in camel case (lower case and then words after first
		// start with capital)
		// Class names are in Pascal case (each first letter of a word is capital)
		int num = 4; // alwyas whole number
		String str = "hiiiii";
		float price = 5.99f; // ends with f for float, always has a decimal
		boolean bool = true; // default is false
		char myName = 'Z';
		double doub = 232.7; // Can have it as either an integer or float.
		long l = 836482; // large numbers
		// These variables can also be used as return types.

/////////////////////////////////////////////////////////////////////////////////

		// assignment operations (=)
		int i = 0;

		// arithmetic operations
		int i2 = 3 + 3; // addition
		int i3 = 3 - 2; // subtraction
		int i4 = 3 * 4; // multiplication
		int i5 = 3 / 6; // divion

		// modulo
		int i6 = 4 % 2; // finds remainder of 4/2
		// % 2 will find if a number is even or odd
		// 1 means odd since there is a remainder. 0 is even.

//////////////////////////////////////////////////////////////////////////////////

		// unary operators
		int i7 = +123; // means i7 is positive so same as i7 = 123
		int i8 = -123; // negative number

		int i9 = 10;
		i9++; // i9 = 11 now, adds one onto value
		i9--; // takes one off i9 so i9 = 10 now

		boolean b = true;
		boolean a = !b; // gives a an opposite value to b so a = false

//////////////////////////////////////////////////////////////////////////////////

		// compund assignment operators
		// multiple operators put together (shortcut)

		int int10 = 3;
		int10 += 3; // adds 3 to int10 and assigns the new value to in10 so int10 = 13
		int10 -= 5; // now int10 = 8 since we took 5 and assigned the new value
		int10 *= 2; // int10 = 16 now (8 * 2 = 16)
		int10 /= 4; // int10 = 4 now (16 / 4 = 4)

		// !=

//////////////////////////////////////////////////////////////////////////////////

		// operators exercise
		Calculator1.addition(3, 5);
		Calculator1.subtraction(3, 5);
		Calculator1.multiply(3, 5);
		Calculator1.divide(3, 5);

		Results.method1(100, 102, 99);
		Results.method2(100, 102, 99);
	}

}
