package javabasic;

import java.util.Scanner;

public class Pallidrome {

	public static void main(String[] args) {
		
		/**
		 * Java program to check if number is palindrome or not.
		 * A number is called palindrome if number and its reverse is equal
		 * This Java program can also be used to reverse a number in Java
		 */

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int inputNumber= scan.nextInt();

		if(inputNumber <0){
			inputNumber = inputNumber* -1;
		}

		int reversalNumber=0;
		int inputNumberCopy=inputNumber;

		while(inputNumber!=0){

			int remainder=inputNumber %10;//155
			int	quoitent=inputNumber/10;
			reversalNumber = (reversalNumber *10) + remainder;
			inputNumber= quoitent;

		}

		if(inputNumberCopy==reversalNumber){

			System.out.println(inputNumberCopy +" Number is palindrome" );
		}
		else{
			System.out.println(inputNumberCopy +" Number is not palindrome");

		}
		scan.close();
	}
}
