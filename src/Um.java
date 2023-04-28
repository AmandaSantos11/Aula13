import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite um número para A: ");
        a = digite.nextInt();

        System.out.println("Digite um número para B: ");
        b = digite.nextInt();

        System.out.println("------------------------");

        if (a == b){
            c = a+b;
            System.out.println("O resultado de A+B é: "+c);
        }
        else{
            c = a*b;
            System.out.println("O resultado de A*B é: "+c);
        }
    }
}
