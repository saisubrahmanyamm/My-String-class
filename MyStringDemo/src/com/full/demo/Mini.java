package com.full.demo;

public class Mini {

	public static void main(String args[]) {
		MyString string = new MyString("hello");

		System.out.println("Reverse of a string : " + string.reverse());
		System.out.println("Vowels of a string : " + string.getVowelsCount());
		System.out.println("Consonant of a String : " + string.getConsonantCount());
		System.out.println("Consonant and Numbers count of a String : " + string.getConsonantCount2());
		System.out.println("Length of a String : " + string.getLength());
		System.out.println("Sum of characters : " + string.getSumOfAllCharacters());
		System.out.println("Num of Capital letters : " + string.getNumCapitalLetters());
		System.out.println((string.toString()));
	}
}
