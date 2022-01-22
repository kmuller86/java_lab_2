public class Main {
    public static void main(String[] args) {
        // Indeks: 56103

        // Zadanie 1
        int i = 1000;
        do {
            if (i % 3 == 0) {
                System.out.println("Liczba " + i + " podzielna przez 3");
            }
        } while (--i > 0);

        System.out.println();

        // Zadanie 2.a
        int tab[] = new int[] { 1, 2, 3, 4, 5 };
        i = 0;
        while (i < 5) {
            System.out.print(tab[i] + " ");
            i++;
        }

        System.out.println();

        // Zadanie 2.b
        double dtab[] = new double[] { 1.0, 2.1, 3.2, 4.3, 5.4 };
        i = 0;
        while (i < 5) {
            System.out.print(dtab[i] + " ");
            i++;
        }

        System.out.println();

        // Zadanie 2.c
        String stab[] = new String[] { "A", "Be", "Ce", "De", "E" };
        i = 4;
        while (i >= 0) {
            System.out.print(stab[i] + " ");
            i--;
        }

        System.out.println();

        // Zadanie 3

        // Niekończąca się pętla
        // while (true) {
        //     System.out.println("Inifnite loop");
        // }

        // Nigdy się nie wykona
        // while (false) {
        //     System.out.println("Unreachable statement");
        // }

    }
}
