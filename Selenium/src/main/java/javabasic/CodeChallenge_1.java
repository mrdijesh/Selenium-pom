package javabasic;

import java.util.Scanner;

public class CodeChallenge_1 {

	public static void main(String[] args) {
		//Factorial 4!=24
				System.out.println("Enter the number for Factor:");
				Scanner scan=new Scanner(System.in);
				int numb=scan.nextInt();
				int i,fact=1;
				for(i=2;i<=numb;i++){    
					fact=fact*i;    
				}    
				System.out.println("Factorial of "+numb+" is: "+fact);   
				scan.close();

	}

}
