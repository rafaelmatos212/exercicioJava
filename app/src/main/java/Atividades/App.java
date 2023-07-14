package Atividades;

import java.util.Scanner;

public class App {

    /*
    Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
    Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
    Informe o valor de custo de cada produto, o valor de venda de cada produto,
    a média de preço de custo e do preço de venda;
     */
    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0;

        Scanner s = new Scanner(System.in);

        for (; i < 5; i++) {

            System.out.println("Nome do produto: ");
            nomeProduto = s.next();

            System.out.println("Preço de compra: ");
            precoCusto = s.nextFloat();

            System.out.println("Preço de venda: ");
            precoVenda = s.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Empate\n");

            } else if (precoCusto > precoVenda) {
                System.out.println("Prejuízo\n");

            } else {
                System.out.println("Lucro\n");
            }

            System.out.println(nomeProduto + ", preço de custo: " + precoCusto
                    + ", preço de venda: " + precoVenda + "\n");

        }

        System.out.println("A média do preço de custo é " + totalCusto / i);
        System.out.println("A média do preço de venda é " + totalVenda / i);
    }
}
