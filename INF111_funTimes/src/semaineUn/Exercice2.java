package semaineUn;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("How much does the product cost?");
		double price = input.nextDouble();
		
		System.out.println("How many were sold?");
		int amountSold = input.nextInt();
		
		System.out.println("The total price comes out to: " + (price * amountSold));
		
	}

}
