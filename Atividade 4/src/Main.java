import java.util.Scanner;

public class Main {

    /*
    Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
    por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
    efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = scan.next();

        System.out.println("Digite o salário do vendedor: ");
        double salarioFixo = (double)scan.nextFloat();

        System.out.println("Total de vendas efetuada no mês: ");
        double totalVendas = (double)scan.nextFloat();

        double salarioFinal = totalVendas * 0.15 + salarioFixo;

        System.out.println("Vendedor: " + nomeVendedor + "\nSalario: " + salarioFixo + "\nSalário final: " + salarioFinal);
    }
}