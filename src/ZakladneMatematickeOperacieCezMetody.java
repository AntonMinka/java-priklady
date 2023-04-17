public class ZakladneMatematickeOperacieCezMetody {

    public static double scitaj(double cislo1, double cislo2) {
        return cislo1 + cislo2;
    }
    public static double odcitaj(double cislo1, double cislo2){
        return cislo1 - cislo2;
    }
    public static double vynasob(double cislo1, double cislo2){
        return cislo1 * cislo2;
    }
    public static double vydel(double cislo1,double cislo2){
        return cislo1 / cislo2;
    }

    public static void main(String[] args) {
        double cislo1 = 5;
        double cislo2 = 2.5;

        System.out.printf("Vysledok scitania hodnot " + cislo1 + " a " + cislo2 + " je: " + scitaj(cislo1, cislo2));
        System.out.printf("\nVysledok odcitania hodnot " + cislo1 + " a " + cislo2 + " je " + odcitaj(cislo1, cislo2));
        System.out.printf("\nVysledok nasobenia hodnot " + cislo1 + " a " + cislo2 + " je " + vynasob(cislo1, cislo2));
        System.out.printf("\nVysledok delenia hodnot " + cislo1 + " a " + cislo2 + " je " + vydel(cislo1, cislo2) );
    }
    }

