/*
Day 2 coding Statement : 
      Write a program to identify if the character is an alphabet or not.
      
      
      **Refer the txt file for detailed description of the problem and the solution approach**
      
*/

import java.util.Scanner;

public class IsAlphabet {
	
	public static String isAlphabet(char ch) {
    //Implementation starts here
    //given character ch is typecasted to int charToNum
		int charToNum = (int)ch;
    //if the ascii value is between 65 and 90 or 97 and 122 then the number is a alphabet
		if((charToNum >= 65 && charToNum <= 90) || (charToNum >= 97 && charToNum <= 122)) {
			return "Alphabet";
		}
		return "Not an alphabet";
	}
	
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		ch = scanner.next().charAt(0);
		scanner.close();
		System.out.println(isAlphabet(ch));
	}
}
