import java.util.Scanner;

public class Main {

    /*
    O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
    dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
    do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
    45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do veículo: ");
        double custoFabrica = scan.nextDouble();

        double impostos = custoFabrica * 0.45;
        double percDist = (custoFabrica + impostos) * 0.28;

        double valorFinal = custoFabrica + impostos + percDist;

        System.out.println("Valor final do veículo é " + valorFinal);

    }
}