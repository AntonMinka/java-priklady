import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {

    public static void main(String[] args) {
        String datumNarodenia = "03.04.2000";
        float znamka = 1.5f;
        String formatString = String.format("%,.1f", znamka);
        //String aktualnyDatum = "18.06.2022";
        int rok = 2022;
        Date aktualnyDatum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");
        String meno = "Jozko Mrkvicka";
        String mesiac = "Septembra";

        System.out.println("Student " + meno + " sa narodil " + datumNarodenia);
        System.out.println("Z maturitnej skúšky má známku " + znamka + " a od " + mesiac +" "+ rok);
        System.out.println("nastupi do noveho zamestnania ako Java Programator");
        System.out.println("V Bratislave dňa " + formatDatumu.format(aktualnyDatum));
        










    }


    }


