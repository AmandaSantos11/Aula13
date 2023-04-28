import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        List<Double> salario = new ArrayList<>();

        int qtd;

        System.out.println("Deseja inserir quantos salários?");
        qtd = digite.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o salário:");
            salario.add(digite.nextDouble());
        }
        System.out.println("-----");
        System.out.println("Os salários digitados foram:"+salario);
        System.out.println("-----");

        double reaj;
        System.out.println("Digite o valor para o reajuste:");
        reaj = digite.nextDouble();

        double porc;
        List<Double> atualizado = new ArrayList<>();

        System.out.println("-----");
        System.out.println("Salários Atualizados:");
        for (int i = 0; i < salario.size(); i++) {
            porc = (salario.get(i)*reaj)/100 + salario.get(i);

            atualizado.add(porc);

            System.out.println(atualizado.get(i));
        }
    }
}
