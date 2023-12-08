import java.util.Scanner;

    public class atv481{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número maior ou igual a 0: ");
        int numero = input.nextInt();

        while (numero < 0) {
            System.out.println("Número negativo. Digite um número maior ou igual a 0: ");
            numero = input.nextInt();
        }

        System.out.print("Digite a base em que deseja representá-lo (2-10): ");
        int base = input.nextInt();

        while (base < 2 || base > 10) {
            System.out.print("Não sei converter. Digite uma base entre 2 e 10: ");
            base = input.nextInt();
        }

        String resultado = converteBase(numero, base);

        System.out.println("Número em decimal: " + numero);
        System.out.println("Número na base " + base + ": " + resultado);
    }

    public static String converteBase(int numero, int base) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder resultado = new StringBuilder();
        
        while (numero > 0) {
            int digito = numero % base;
            resultado.insert(0, digito);
            numero /= base;
        }

        return resultado.toString();
    }

    }
