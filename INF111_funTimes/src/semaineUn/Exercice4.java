package INF111_funTimes.src.semaineUn;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your age?");
		int age = input.nextInt();
		
		if(age> 17) {
			System.out.println("Congrats on being an adult");
			
		}else {
			System.out.println("Seems like you are a minor...");
		}
	}

}
