import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        int val;

        System.out.println("Informe um número: ");
        val = digite.nextInt();

        if (val % 2 == 0){
            System.out.println("O resultado da operação é: " + (val+5));
        }
        else{
            System.out.println("O resultado da operação é: " + (val+8));
        }
    }
}
