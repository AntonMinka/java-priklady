/*ZADANIE
        Vytvorte program, ktorý na základe textového zadania známky,
        napr. výborný, chválitebný, dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku čiže 1, 2, 3, 4, 5.*/


import java.text.Normalizer;
import java.util.Scanner;

public class PriradTextoveHodnotenieKCiselnemu {

    public static String odstranDiakritiku(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
    public static void main(String[] args) {
        String slovnaZnamka = "";

        // START, cyklus začne
        while(!slovnaZnamka.equals("koniec")){
        //while (true) {
            System.out.println("\nZadaj slovnú známku(výborný, chválitebný, dobrý, dostatočný, nedostatočný):");
            System.out.println("Poznámka: po zadaní príkazu 'koniec' program ukončí svoju činnosť");
            Scanner scn = new Scanner(System.in);
            slovnaZnamka = scn.nextLine();


            slovnaZnamka = odstranDiakritiku(slovnaZnamka);
            //System.out.println("Slovná známka bez diakritiky vyzerá takto: " + slovnaZnamka);


            //slovnaZnamka = slovnaZnamka.toLowerCase().toUpperCase();
            //System.out.println("Slovná známka po experimente s 2 metodami vyzerá takto: " + slovnaZnamka);


            if (slovnaZnamka.equalsIgnoreCase("vyborny")) {
                System.out.println(1);
            } else if (slovnaZnamka.equalsIgnoreCase("chvalitebny")) {
                System.out.println(2);
            } else if (slovnaZnamka.equalsIgnoreCase("dobry")) {
                System.out.println(3);
            } else if (slovnaZnamka.equalsIgnoreCase("dostatocny")) {
                System.out.println(4);
            } else if (slovnaZnamka.equalsIgnoreCase("nedostatocny")) {
                System.out.println(5);
            } else {
                System.out.println("Pre zadanu znamku neexistuje ciselna znamka");
            }
        }
    }
    // KONIEC cyklus sa skončí

    }
