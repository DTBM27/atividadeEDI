import java.util.Scanner;

public class atv490 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra em letras minúsculas " + (i + 1) + ": ");
            nome[i] = scanner.nextLine();
            int removidos = removerCaractere(nome[i], 'c');
            System.out.println((i + 1) + " - " + nome[i]);
            System.out.println(removidos + " caractere(s) removido(s).\n");
        }
    }

    public static int removerCaractere(String[] vet, int tam, char caractere) {
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            char[] palavra = vet[i].toCharArray();
            for (int j = 0; j < palavra.length; j++) {
                if (palavra[j] == caractere) {
                    palavra[j] = '*';
                    cont++;
                }
            }
            vet[i] = new String(palavra);
        }
        return cont;
    }
}
