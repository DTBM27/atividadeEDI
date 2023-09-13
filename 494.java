import java.util.Scanner;

public class OrdenacaoComFuncaoTroca {
    public static void main(String[] args) {
        int L, c;
        String nome[] = new String[3];
        String prof[] = new String[3];
        String ender[] = new String[3];

        Scanner scanner = new Scanner(System.in);

        for (L = 0; L < 3; L++) {
            System.out.print("\nDigite o nome: ");
            nome[L] = scanner.nextLine();

            System.out.print("Digite o endereço: ");
            ender[L] = scanner.nextLine();

            System.out.print("Digite a profissão: ");
            prof[L] = scanner.nextLine();
        }

        for (L = 0; L < 2; L++) {
            for (c = L + 1; c < 3; c++) {
                if (nome[L].compareTo(nome[c]) > 0) {
                    troca(nome, L, c);
                    troca(ender, L, c);
                    troca(prof, L, c);
                }
            }
        }

        for (L = 0; L < 3; L++) {
            System.out.println("\n" + nome[L] + "\t" + ender[L] + "\t" + prof[L]);
        }
    }

    public static void troca(String[] vetor, int pos1, int pos2) {
        String aux = vetor[pos1];
        vetor[pos1] = vetor[pos2];
        vetor[pos2] = aux;
    }
}
