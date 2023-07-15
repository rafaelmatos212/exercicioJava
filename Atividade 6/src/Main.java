import java.util.Scanner;

public class Main {

    /*
    Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
    possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
    trocados
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        int a = scan.nextInt();

        System.out.println("Digite o número B: ");
        int b = scan.nextInt();

        System.out.println("Número A: " + a);
        System.out.println("Número B: " + b);

        int temp = b;
        b = a;
        a = temp;

        System.out.println("Novo número A: " + a);
        System.out.println("Novo número B: " + b);

    }
}