package laboSemaineDeux;
import java.util.Scanner;
public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int count = 0;
		
		double niceVal = 1;
		
		while(niceVal != 0) {
			
			System.out.println("Give me a nice value");
			 niceVal = input.nextInt();
			 
			 if(niceVal == 0) {
				 break;
			 }
			
			for(int i = 2; i < niceVal; i++) {
				if(niceVal% i == 0) {
					count++;
				}
			}
			if(count > 0) {
				System.out.println("This value is not prime\n");
			}else {
				System.out.println("This value is prime\n");

			}
		}
		
		System.out.println("Thanks for taking part, we are now done");
		
	}

}
