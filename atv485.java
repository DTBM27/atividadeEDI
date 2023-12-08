import java.util.Scanner;

public class atv485 {
    public static void main(String[] args) {
        int[] num = new int[6];
        char[] num1 = new char[6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o caractere " + (i + 1) + ": ");
            num1[i] = scanner.next().charAt(0);
        }

        multivetor(num, num1, 6);
    }

    public static void multivetor(int[] vet1, char[] vet2, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.println();
            for (int w = 0; w < vet1[i]; w++) {
                System.out.print(vet2[i]);
            }
        }
    }
}

}
