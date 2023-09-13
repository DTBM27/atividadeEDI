import java.util.Scanner;

public class OrdenacaoDeStrings {
    public static void main(String[] args) {
        int L;
        String nome[][] = new String[5][20];

        Scanner scanner = new Scanner(System.in);

        for (L = 0; L < 5; L++) {
            System.out.print("Digite o nome " + (L + 1) + ": ");
            nome[L][0] = scanner.nextLine();
        }

        ordena(nome, 5);

        System.out.println("\nNOMES ORDENADOS\n");

        for (L = 0; L < 5; L++) {
            System.out.println((L + 1) + " - " + nome[L][0]);
        }
    }

    public static void ordena(String[][] vet, int tam) {
        int Li, ci;
        String aux;

        for (Li = 0; Li < tam - 1; Li++) {
            for (ci = Li + 1; ci < tam; ci++) {
                if (vet[Li][0].compareTo(vet[ci][0]) > 0) {
                    aux = vet[Li][0];
                    vet[Li][0] = vet[ci][0];
                    vet[ci][0] = aux;
                }
            }
        }
    }
}
