import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> listaParole = new HashSet<>();

        int nElementi = 0;

        System.out.println("Quanti elementi vuoi inserire nela Collezione?");
        try {
            nElementi = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("Digita un numero");
        }

        for (int i = 0; i < nElementi; i++) {
            System.out.println("Inserisci parola");
            String parola = scanner.nextLine();

            if (listaParole.contains(parola)) {
                System.out.println("Duplicato: " + parola);
                i--;
            } else {
                listaParole.add(parola);
            }
        }

        System.out.println(listaParole);

    }
}