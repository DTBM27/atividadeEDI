import java.util.Scanner;

public class atv487 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        inverte(num, 10);

        System.out.println("\nVETOR");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + num[i]);
        }
    }

    public static void inverte(int[] vet, int max) {
        int k = max;
        for (int i = 0; i < max / 2; i++) {
            int aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
}

