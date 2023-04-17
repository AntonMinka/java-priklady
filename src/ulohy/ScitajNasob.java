package ulohy;

public class ScitajNasob {
    public static void main(String[] args) {
        int cisla[] = {1, 8, 9, 10, 12};
        int sum = 0;
        int nasob = 1;

        // Funkcia scitania hodnot pola
        // Cyklus oznacovany ako foreach prechadza kazdym prvkom pola
        for (int cislo : cisla) {
            //sum = sum + cislo;
            sum += cislo; // Je to identicka logika scitania ako pri riadku vyssie
            //System.out.println(cislo); // Vypiseme obsah kazdeho prvku pola
        }
        System.out.println("Výsledok sčítania je: " + sum);


        // TODO Funkcia nasobenia hodnot pola, do 20:30
        // * pre nasobenie           / pre delenie
        for (int cislo : cisla) {
            //sum = sum + cislo;
            nasob *= cislo; // Je to identicka logika scitania ako pri riadku vyssie
            //System.out.println(cislo); // Vypiseme obsah kazdeho prvku pola
        }
        System.out.println("Výsledok násobenia je: " + nasob);
    }
}