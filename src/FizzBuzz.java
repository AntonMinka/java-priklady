import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj cisla napr. v tvare 3 8 12 45 98");
        String vstupneHodnoty = scn.nextLine();
        System.out.println("Zadané vstupné hodnoty sú:" + vstupneHodnoty);

        String [] poleHodnot = vstupneHodnoty.split(" ");
        //System.out.println("Pole individualnych zadanych hodnot je: " + poleHodnot);

        System.out.println("Vypisujem hodnoty individualne, teda tie ktore su rozdelene:");
        for (int i = 0; i < poleHodnot.length; i++) {
            String individualnaHodnota = poleHodnot[i];
            int hodnota = Integer.parseInt(individualnaHodnota);

            if (hodnota % 15 ==0){
                System.out.print("Fizz Buzz");
            } else if (hodnota % 3 == 0) {
                System.out.print("Fizz");
            } else if (hodnota % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(hodnota);
            }
            System.out.print(", ");
        }


    }
    }

