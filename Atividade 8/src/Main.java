import java.util.Scanner;

public class Main {

    /*
    Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
    dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
    disponíveis com o usuário;
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Cotação do dólar: ");
        double cotacaoDolar = scan.nextDouble();

        System.out.println("Dólares na carteira: ");
        double qntDolar = scan.nextDouble();

        double conversaoReal = qntDolar * cotacaoDolar;

        System.out.println("Conversão dólar -> real: " + conversaoReal);

    }
}