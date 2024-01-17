package laboSemaineDeux;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double pi = 1.0;

        for (int i = 1; i <= 10000; i++) {
            double numerator = 2.0 * i;
            double term = (numerator * numerator) / ((numerator - 1) * (numerator + 1));
            pi *= term;
        }
		
			
		System.out.println("The value of pi is equal to: " + pi * 2  );
	}

}
