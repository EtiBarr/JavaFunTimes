package INF111_funTimes.src.semaineUn;

public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this obviously causes a bug since a byte can only be up to 126
		byte val = 126;
		
		while (val < 129) {
			System.out.println(val);
			val++;
		}
		
	}

}
