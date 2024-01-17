package INF111_funTimes.src.laboSemaineDeux;
import java.util.Scanner;

public class ExerciceDeux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a nice value");
		double inputUser = input.nextDouble();
		
		int divi = 1;
		
		for(divi = 1; divi <= inputUser; divi++) {
			if(inputUser % divi == 0) {
				System.out.println(divi);
			}
		}

	}

}
