import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        String nome;
        int numero;

        System.out.println("Digite um nome:");
        nome = digite.next();

        System.out.println("Digite um número:");
        numero = digite.nextInt();

        System.out.println("-----");

        for (int i = 0; i < numero; i++) {
            System.out.println(nome + "");
        }
    }
}
