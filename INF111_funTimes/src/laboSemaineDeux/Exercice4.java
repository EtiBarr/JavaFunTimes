package laboSemaineDeux;
import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a very nice value");
		int niceVal = input.nextInt();
		
		for(int i = 2; i <niceVal; i++) {
			
			if(niceVal % i == 0 ) {
				count++;
			}
		}
		
		if(count > 0) {
			
			System.out.println("This number is not prime");

		}else {
			System.out.println("This number is prime");

		}

	}

}
