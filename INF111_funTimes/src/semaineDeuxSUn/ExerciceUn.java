package INF111_funTimes.src.semaineDeuxSUn;
import java.util.Scanner; 

public class ExerciceUn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me two values");
		
		int numerator = input.nextInt();
		int denomenator = input.nextInt();
		
		
		if(denomenator == 0) {
			System.out.println("impossible");
		}else if(denomenator == 1) {
			System.out.println(numerator);
		}else if(numerator == 0) {
			System.out.println("0");
		}else if(denomenator < 0) {
			numerator *= -1;
			denomenator *= -1;
			
			System.out.println(numerator/denomenator);
		}else {
			System.out.println(numerator/denomenator);

		}

	}

}
