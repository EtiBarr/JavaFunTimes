package INF111_funTimes.src.ClassTrois;
import java.util.Scanner;
public class partieUn {
    public static void main(String[] args){

    int test = 1;
    int test2=3;


    Scanner input = new Scanner(System.in);
    int val3 = calculateSomething(test, test2);

    System.out.println("This is something that we already learned last semester" + val3);

    }
    public static int calculateSomething(int val1, int val2){

        int val3 = val1 + val2;

        return val3;

    }
}
