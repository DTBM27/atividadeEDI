import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int L, c, num[] = new int[10], n, aux;

        Scanner scanner = new Scanner(System.in);

        for (L = 0; L < 10; L++) {
            System.out.print("Digite o número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        System.out.print("Digite o número de busca: ");
        n = scanner.nextInt();

        ordena(num, 10);

        c = busca(num, 10, n);

        System.out.println("\nVETOR\n");

        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }

        if (c != -1) {
            System.out.println("\nPosição no vetor: " + c);
        } else {
            System.out.println("\nNão encontrado.");
        }
    }

    public static void ordena(int[] vet, int tam) {
        int i, j, aux;

        for (i = 0; i < tam - 1; i++) {
            for (j = 0; j < tam - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0, fim = tam - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1;
    }
}
