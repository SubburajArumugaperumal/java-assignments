package assignment.fifthdayW3D1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stoss";
		String text2 = "potss";
		boolean Anagram =true;
		if (text1.length() != text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		} else {
			char[] charArr1 = text1.toCharArray();
			char[] charArr2 = text2.toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			for (int i = 0; i < charArr1.length; i++) {
					if(charArr1[i] != charArr2[i]) {
						Anagram = false;
						break;
					} 
			}
			if (Anagram){
						System.out.println("The given strings are an Anagram.");
					}
					else {
						System.out.println("The given strings are not an Anagram.");
				}

			}
		}
	}
