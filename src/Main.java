import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();

        // Zadanie 1.a
        switch (liczba % 2) {
            case 0: System.out.println("Liczba jest parzysta"); break;
            case 1: System.out.println("Liczba jest nieparzysta"); break;
        }

        // Zadanie 1.b
        switch (liczba % 7) {
            case 0: System.out.println("Liczba jest podzielna przez 7"); break;
            default: System.out.println("Liczba nie jest podzielna przez 7"); break;
        }

        // Zadanie 2.a + 2.b
        int[] ilosc = new int[] { 0, 0, 0, 0, 0 }; // 0 - o, 1 - p, 2 - x, 3 - z, 4 - q
        int inne = 0;
        String wyraz = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";

        for (int i = 0; i < wyraz.length(); i++) {
            switch (wyraz.charAt(i)) {
                case 'o': ilosc[0]++; break;
                case 'p': ilosc[1]++; break;
                case 'x': ilosc[2]++; break;
                case 'z': ilosc[3]++; break;
                case 'q': ilosc[4]++; break;
                default: inne++; break;
            }
        }

        System.out.println("Litera 'o' wystąpiła: " + ilosc[0] + "x");
        System.out.println("Litera 'p' wystąpiła: " + ilosc[1] + "x");
        System.out.println("Litera 'x' wystąpiła: " + ilosc[2] + "x");
        System.out.println("Litera 'z' wystąpiła: " + ilosc[3] + "x");
        System.out.println("Litera 'q' wystąpiła: " + ilosc[4] + "x");
        System.out.println("Pozostałych liter: " + inne);
    }
}
