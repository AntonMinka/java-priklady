/*Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.


        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.*/

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
    double cislo1 = 5;
    double cislo2 = 2;

    double scitanie = cislo1 + cislo2;
    double odcitanie = cislo1 - cislo2;
    double nasobenie = cislo1 * cislo2;
    double delenie = cislo1 / cislo2;
    double modulo = cislo1 % cislo2;

        System.out.println("Vysledkom scitania hodnot " + cislo1 + " a " + cislo2 + " je " + scitanie );
        System.out.println("Vysledkom odcitanie hodnot " + cislo1 + " a " + cislo2 + " je " + odcitanie );
        System.out.println("Vysledkom nasobenia hodnot " + cislo1 + " a " + cislo2 + " je " + nasobenie );
        System.out.println("Vysledkom delenia hodnot " + cislo1 + " a " + cislo2 + " je " + delenie );
        System.out.println("Vysledkom modula hodnot " + cislo1 + " a " + cislo2 + " je " + modulo );


        System.out.printf("\nVysledkom scitania hodnot " + cislo1 + " a " + cislo2 + " je " + scitanie );
        System.out.printf("\nVysledkom odcitania hodnot %.2f a %.2f je %.2f", cislo1, cislo2, odcitanie );
        System.out.printf("\nVysledkom nasobenia hodnot " + cislo1 + " a " + cislo2 + " je " + nasobenie );
        System.out.printf("\nVysledkom delenia hodnot " + cislo1 + " a " + cislo2 + " je " + delenie );
        System.out.printf("\nVysledkom modula hodnot " + cislo1 + " a " + cislo2 + " je " + modulo );


    }
}
