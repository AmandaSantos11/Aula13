import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        List<Integer> numero = new ArrayList<>();

        int num;
        int soma=0;

        System.out.println("Quantos números você deseja digitar?");
        num = digite.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Digite um número:");
            numero.add(digite.nextInt());

            if (numero.get(i) > 0){
                soma += numero.get(i);
            }
            else {
                System.out.println("----");
                System.out.println("Um número negativo foi digitado!");
                break;
            }
            // não consegui adicionar o print que mostra a SOMA
        }
    }
}
