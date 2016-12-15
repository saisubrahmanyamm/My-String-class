package com.full.demo;

import com.full.util.*;

/**
 * 
 * @author Sai_Subrahmanyam
 * @category Assignment #1 - MyString Demo
 *
 */
public class MyString extends AbstractMyString {

	public MyString(String s) {
		theString = s;
	}

	// static MyString ref;

	@Override
	public int getVowelsCount() {
		// TODO Auto-generated method stub
		char ch;

		int vowels = 0;
		for (int i = 0; i < theString.length(); i++) {
			ch = theString.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				vowels++;
			}
		}

		return vowels;
	}

	@Override
	public int getConsonantCount() {

		// TODO Auto-generated method stub
		char ch1;
		int consonant = 0;
		String s = theString;

		for (int i = 0; i < theString.length(); i++) {
			ch1 = theString.charAt(i);
			if ((ch1 >= 65 && ch1 <= 90) || (ch1 >= 97 && ch1 <= 122)) {
				if ((ch1 != 'a' && ch1 != 'A' && ch1 != 'e' && ch1 != 'E' && ch1 != 'i' && ch1 != 'I' && ch1 != 'o'
						&& ch1 != 'O' && ch1 != 'u' && ch1 != 'U')) {

					consonant++;
				}
			}

		}

		return consonant;

	}

	public int getConsonantCount2() {
		return this.getLength() - this.getVowelsCount();
	}

	@Override
	public int getNumCapitalLetters() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < theString.length(); i++) {

			char character = theString.charAt(i);
			int ascii = (int) character;
			if (ascii >= 65 && ascii <= 90) {
				count++;
			}

		}
		return count;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub

		int length = 0;
		char a[] = theString.toCharArray();
		for (char c : a) {
			length++;
		}
		return length;
	}

	@Override
	public int getSumOfAllCharacters() {
		// TODO Auto-generated method stub
		int sum = 0;
		int res = 0;
		for (int i = 0; i < theString.length(); i++) {
			// char character2 = theString.charAt(i);
			char c = theString.charAt(i);
			int ascii2 = (int) c - 48;
			if (ascii2 < 10 && ascii2 > 0)
				res = res + ascii2;

		}

		for (int i = 0; i < theString.length(); i++) {

			char character = theString.charAt(i);
			char character1 = theString.charAt(i);
			int ascii = (int) character - 64;
			int ascii1 = (int) character1 - 96;
			if (ascii <= 26 && ascii >= 1) {
				if (ascii == 32)
					continue;

				sum = sum + ascii;
			} else if (ascii1 <= 26 && ascii1 >= 1) {
				if (ascii1 == 32)
					continue;

				sum = sum + ascii1;
			}

		}
		return sum + res;
	}

	@Override
	public String reverse() {
		String reverse = "";
		for (int i = theString.length() - 1; i >= 0; i--) {
			reverse = reverse + theString.charAt(i);
		}

		return reverse;
	}
}
