import com.sun.source.util.Trees;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Indeks: 56103

        Scanner scanner = new Scanner(System.in);

        // Zadanie 1.a
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lista.add(scanner.nextLine());
        }

        // Zadanie 1.b
        Zadanie1BCD(lista);
        System.out.println();

        // Zadanie 1.c
        lista.remove(lista.size() - 1);
        lista.remove(lista.size() - 1);
        lista.remove(1);
        for (int i = 0; i < 4; i++) {
            lista.add(scanner.nextLine());
        }
        Zadanie1BCD(lista);
        System.out.println();
        System.out.println("Ilość elementów: " + lista.size());

        // Zadanie 1.d
        Collections.sort(lista);
        System.out.println("Posortowane");
        Zadanie1BCD(lista);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println();
        System.out.println("Posortowane reverse");
        Zadanie1BCD(lista);
        System.out.println();

        // Zadanie 2.a
        Set<Integer> stab = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            stab.add(scanner.nextInt());
        }

        // Zadanie 2.b
        System.out.println(stab);

        // Zadanie 2.c
        for (int v : stab) {
            System.out.print(v + " ");
        }
    }

    public static void Zadanie1BCD(ArrayList<String> lista) {
        for (String v : lista) {
            System.out.print(v + " ");
        }
    }
}
