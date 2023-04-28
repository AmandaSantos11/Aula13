import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        int vet[] = new int [4];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Escreva um número: ");
            vet[i] = digite.nextInt();
        }
        System.out.println("-----");

        System.out.println("Os números que estão entre 0 a 100 são: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i]>=0 && vet[i]<=100){
                System.out.println(vet[i]);
            }
        }
    }
}
