import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Indeks: 56103

        // Zadanie 1
        int[] tab = new int[20];
        Zadanie1B(tab);
        Zadanie1C(tab);

        // Zadanie 2
        String[] stab = new String[6];
        Zadanie2B(stab);
        Zadanie2C(stab);

        // Zadanie 3
        Zadanie3ABC("Tomasz");
        Zadanie3ABC("Tomasz", "Babiak");
        Zadanie3ABC("Tomasz", "Babiak", 24);

        // Zadanie 4
        int resA = Zadanie4AB(1, 2);
        int resB = Zadanie4AB(7, 8, 9);
        System.out.println("Wynik: " + (resA + resB));
    }

    public static void Zadanie1B(int[] tab) {
        for (int i = 0; i < 20; i++) {
            tab[i] = 40 - i;
        }
    }

    public static void Zadanie1C(int[] tab) {
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void Zadanie2B(String[] tab) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            tab[i] = scanner.nextLine();
        }
    }

    public static void Zadanie2C(String[] tab) {
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void Zadanie3ABC(String param) {
        System.out.println(param);
    }

    public static void Zadanie3ABC(String param1, String param2) {
        System.out.println(param1 + " " + param2);
    }

    public static void Zadanie3ABC(String param1, String param2, int param3) {
        System.out.println(param1 + " " + param2 + ", lat " + param3);
    }

    public static int Zadanie4AB(int param1, int param2) {
        return param1 + param2;
    }

    public static int Zadanie4AB(int param1, int param2, int param3) {
        return param1 + param2 + param3;
    }
}
