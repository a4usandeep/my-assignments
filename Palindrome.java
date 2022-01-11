package com.assignment2.training;

import java.util.Scanner;

public class Palindrome {
	 public static void main(String args[])
	   {
		 Scanner sc = new Scanner(System.in);
	      String str, reverse = ""; 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + str.charAt(i);
	 
	      if (str.equals(reverse)) {
	         System.out.println(str+" is a palindrome");
	      }
	      else {
	         System.out.println(str+" is not a palindrome");
	      }
	   }
}