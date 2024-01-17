package INF111_funTimes.src.semaineUn;
import java.util.Scanner;


public class ExerciceUn {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			final int articleAmount = 36;

			Scanner input = new Scanner(System.in);
			
			System.out.println("How many boxes do you have?");
			int boxAmount = input.nextInt();
			
			System.out.println("how heavy is the things inside the box?");
			double articleWeight = input.nextDouble();
			
			double perBoxWeight = articleWeight * articleAmount;
			double totaleWeight = articleWeight * articleAmount * boxAmount;
			
			System.out.println("each box weighs " + perBoxWeight + "and the totale comes out to: "+ totaleWeight);
		}

	}
