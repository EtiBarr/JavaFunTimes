package INF111_funTimes.src.semaineUn;

	import java.util.Scanner;
	
public class exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.14159;

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		double radius = input.nextDouble();
		
		System.out.println("The area of the circle is equal to: " + (pi * Math.pow(radius, 2)));
	}

}
