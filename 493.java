import java.util.Scanner;

public class VerificaOrdenacao {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        int resultado = verificaOrdem(num, 10);

        if (resultado == 1) {
            System.out.println("\nORDENAÇÃO CRESCENTE");
        } else if (resultado == 2) {
            System.out.println("\nORDENAÇÃO DECRESCENTE");
        } else {
            System.out.println("\nNÃO ESTÁ ORDENADO");
        }
    }

    public static int verificaOrdem(int[] vetor, int tamanho) {
        if (busca(vetor, tamanho)) {
            return 1; // Ordenação crescente
        } else if (buscaInversa(vetor, tamanho)) {
            return 2; // Ordenação decrescente
        } else {
            return 0; // Não está ordenado
        }
    }

    public static boolean busca(int[] vet, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean buscaInversa(int[] vet, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            if (vet[i] < vet[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
