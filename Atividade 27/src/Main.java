import java.util.Scanner;

public class Main {

    /*
    A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
    algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
    calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%).
    Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes.
    */

    //NÃO FINALIZADA
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float valorVeiculo = 0.0f;
        float desconto = 0.0f;

        do {

            System.out.println("Digite o valor do veículo (valor zerado encerra o programa): ");
            valorVeiculo = scan.nextFloat();

            System.out.println("Digite o tipo de combustível:\n1) Álcool;\n2) Gasolina;\n3) Diesel.");
            int tipoCombustivel = scan.nextInt();

            switch (tipoCombustivel) {
                case 1:
                    desconto = valorVeiculo * 0.25f;
                    System.out.println(desconto);
                    System.out.println(valorVeiculo - desconto);
                    break;

                case 2:
                    desconto = valorVeiculo * 0.21f;
                    System.out.println(desconto);
                    System.out.println(valorVeiculo - desconto);
                    break;

                case 3:
                    desconto = valorVeiculo * 0.14f;
                    System.out.println(desconto);
                    System.out.println(valorVeiculo - desconto);
                    break;

                default:
                    System.out.println("Tipo incorreto");
            }
        } while (valorVeiculo > 0);
    }

}