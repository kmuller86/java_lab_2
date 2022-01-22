import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Indeks: 56103

        // Zadanie 1
        for (int i = 100; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Zadanie 2
        int[] tab = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            tab[i] = scanner.nextInt();
        }

        for (int v : tab) {
            System.out.print((v + 11) + " ");
        }
    }
}
