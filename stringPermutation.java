/** Program:  18.25 String permutation
  * File:     stringPermutation.java 
  * Summary:  Chapter 18, Excersise 25, displays all the permutations of a string
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class stringPermutation {

	public static void main(String[] args) {
		//Start Scanner for String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		//display permutations
		System.out.println("Permutations of " + s + " are: ");
		
		//method
		displayPermutation(s);

	}

	public static void displayPermutation(String s) {
		displayPermutation("", s);
		
	}

	public static void displayPermutation(String s1, String s2) {
		if (s2.length() == 0) {
			System.out.println(s1);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
			}
		}
		
	}

}
