package q6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=-1;
		do {
			try {
				System.out.println("Please enter a number or enter ?-1? if you want to quit");
				input=sc.nextInt();
				
				if(input>100) {
					throw new InputException("Number can?t be greater than 100");
				}else if(input==-1) {
					
				}else if(input%2==0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			}catch(InputMismatchException e) {
				System.out.println("You must enter an integer");
			}catch(InputException e) {
				System.out.println(e.getMessage());
			}
		} while(input!=-1);
		System.out.println("Your program ended");
		sc.close();
	}

}
