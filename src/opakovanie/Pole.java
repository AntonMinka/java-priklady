package opakovanie;

public class Pole {
    public static void main(String[] args) {
        int [] cisla = {1, 8, 11, 12, 90};

        for (int i = 0; i < cisla.length; i++) {
            //System.out.println(cisla[i]);

            if (cisla[i] % 2 ==0){
                System.out.println("Cislo " + cisla[i] + " je párne");
            }else {
                System.out.println("Cislo " + cisla[i] + " je nepárne");
            }


        }
    }
}
