package ulohy;

public class ScitajNasobCezMetody {
    public static void main(String[] args) {
        int cisla[] = {1, 8, 9, 10, 12};

        int vysledokScitania = scitaj(cisla);
        int vysledokNasobenia = nasob(cisla);

        System.out.println("Výsledok sčítania je: " + vysledokScitania);
        System.out.println("Výsledok násobenia je: " + vysledokNasobenia);

    }

    public static int scitaj(int cisla[]) {
        int sum = 0;
        for (int cislo : cisla) {
            sum += cislo; // Je to identicka logika scitania ako pri riadku vyssie
        }
        return sum;
    }

    public static int nasob(int cisla[]) {
        int nasob = 1;
        for (int cislo : cisla) {
            nasob *= cislo; // Je to identicka logika scitania ako pri riadku vyssie
        }
        return nasob;
    }

}
