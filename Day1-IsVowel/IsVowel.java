/*
Day 1 coding Statement: 
      Write a program to identify if the character is a vowel or consonant.
      
      
      **Refer the IsVowel.txt file for a detailed description of the problem along with the solution approach**
*/



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsVowel {


	public static String isVowel(char ch) {
  //Implementation starts here
  
    //Predefined List of Vowels
		List<Character> vowels = new ArrayList<Character>();
    
    //Add [a,e,i,o,u] to the list 
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

    //Add [A,E,I,O,U] to the list
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

    //Received Character is typecasted to int to check the characters ascii value
		int charToNum = (int)ch;
		if((charToNum >= 65 && charToNum <= 90) || (charToNum >= 97 && charToNum <= 122)) {
    //if the ascii value is of a alphabet check if it lies in the list or not
			if (vowels.contains(ch))
				return "Vowel";
			else
				return "Consonant";
		}
		return "Invalid Input";
	}

	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		ch = scanner.next().charAt(0);
		scanner.close();
		System.out.println(isVowel(ch));

	}
}
