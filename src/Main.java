public class Main {
    public static void main(String[] args) {
        // Indeks: 56103

        // Zadanie 1.a
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Zadanie 1.a - BREAK");
                break;
            }

            System.out.println("Zadanie 1.a - " + i);
        }

        // Zadanie 1.b
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Zadanie 1.b - CONTINUE");
                continue;
            }

            System.out.println("Zadanie 1.b - " + i);
        }

        // Zadanie 1.c
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Zadanie 1.c - RETURN");
                return;
            }

            System.out.println("Zadanie 1.c - " + i);
        }
    }
}
