package INF111_funTimes.src.classTwoSummer;

public class classTwo {

    public static void main(String[] args) {


        int i = 3;

        int x = 10;

        switch(i) {

            case 0: case 1: case 2: break;

            case 3: i += 2;

            case 4: x += i; break;

            default: x = 3;

        }

        System.out.println("i: " + i + "x:" + x);
    }
    }
