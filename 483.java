public class ProdutoInterno {
    public static void main(String[] args) {
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor 1: ");
            vetor1[i] = lerInteiro();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor 2: ");
            vetor2[i] = lerInteiro();
        }

        int resultado = calcularProdutoInterno(vetor1, vetor2);

        System.out.println("\nVETOR A\tVETOR B");
        for (int i = 0; i < 4; i++) {
            System.out.println(vetor1[i] + "\t" + vetor2[i]);
        }

        System.out.println("\nProduto interno: " + resultado);
    }

    public static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int calcularProdutoInterno(int[] vetor1, int[] vetor2) {
        int produto = 0;

        for (int i = 0; i < vetor1.length; i++) {
            produto += vetor1[i] * vetor2[i];
        }

        return produto;
    }
}
