public class PremenneCezVar {
    public static void main(String[] args) {
        var meno = "Anton";
        var priezvisko = "Minka";
        var vek = 25;

        System.out.println(meno);
        System.out.println(priezvisko);
        System.out.println(vek);

        //vek = vek + 1;
        vek++;
        System.out.println("Vek o 1 rok viac = " + vek);

        //vek = vek - 1;
        vek--;
        System.out.println("Vek spat na realny = " + vek);


    }
}
