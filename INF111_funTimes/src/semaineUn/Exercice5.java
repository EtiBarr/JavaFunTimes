package semaineUn;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me two values");
		double firstVal = input.nextDouble();
		double secondVal = input.nextDouble();
		
		if(firstVal > secondVal) {
			System.out.println("The biggest number is: " + firstVal);
		}else {
			System.out.println("The biggest number is: " + secondVal);

		}
	}

}
