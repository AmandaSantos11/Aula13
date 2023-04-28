import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tres {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        List<Integer> notas = new ArrayList<>();

        int nIdent, nota, soma = 0;
        float meE, meA;

        System.out.println("Digite o número de identificação do aluno: ");
        nIdent = digite.nextInt();

        System.out.println("----");

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a nota do aluno: ");
            notas.add(nota = digite.nextInt());
            soma += notas.get(i);
        }
        System.out.println("----");

        meE = soma / 3;

        meA = notas.get(0) + notas.get(1) * 2 + notas.get(2) * 3 + meE / 7;

        System.out.println("Aluno-" + nIdent);

        System.out.println("Notas:");

        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota-" + notas.get(i));
        }

        System.out.println("----");

        System.out.println("Media Exercicios: " + meE);

        System.out.println("----");

        System.out.print("Media de Aproveitamento: ");
        if (meA >= 90) {
            System.out.print("Aprovado");
        }
        else if (meA >= 75 && meA < 90) {
            System.out.print("Aprovado");
        }
        else if (meA >= 60 && meA < 75) {
            System.out.print("Aprovado");
        }
        else if (meA >= 40 && meA < 60) {
            System.out.print("Reprovado");
        }
        else if (meA < 40) {
            System.out.print("Reprovado");
        }
        else {
            System.out.print("Error");
        }
    }
}
