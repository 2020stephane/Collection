import java.util.Arrays;

public class Main {

    static String[] tabStringSansNew = {"String1", "String2"};
    String[] Perroquet;

    Main() {
        System.out.println("avant :");
        System.out.println(tabStringSansNew[0]+ " , " + tabStringSansNew[1]);
        swap(tabStringSansNew);
        System.out.println("apres :");
        System.out.println(tabStringSansNew[0]+ " , " + tabStringSansNew[1]);
        Perroquet Jacko = new Perroquet("Jacko","rouge","koco");
        Perroquet Pico = new Perroquet("Pico","vert","coco");
        Perroquet[] Voiliere = { Jacko, Pico};
        System.out.println("avant :");
        System.out.println(Voiliere[0].nom + " : " + Voiliere[0].cri +
                " , " + Voiliere[0].couleur);
        System.out.println(Voiliere[1].nom + " : " + Voiliere[1].cri +
                " , " + Voiliere[1].couleur);
        swap(Voiliere);
        System.out.println("apres :");
        System.out.println(Voiliere[0].nom + " : " + Voiliere[0].cri +
                " , " + Voiliere[0].couleur);
        System.out.println(Voiliere[1].nom + " : " + Voiliere[1].cri +
                " , " + Voiliere[1].couleur);
    }

    public static void main(String[] args) { new Main();  }


    public static void swap(String[] tab) {

        String tmp = tab[0];
        tab[0] = tab[1];
        tab[1] = tmp;

    }
    public static void swap(Perroquet[] tab) {

        Perroquet tmp = tab[0];
        tab[0] = tab[1];
        tab[1] = tmp;

    }
}
