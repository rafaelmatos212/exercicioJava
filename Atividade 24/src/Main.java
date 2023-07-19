import java.util.Scanner;

public class Main {

    /*
    Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        char continuar;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if(numero > 0){
                System.out.println("Positivo");
            } else if(numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }

            System.out.println("Deseja continuar? Sim/Não");
            continuar = scan.next().charAt(0);

        } while(continuar == 'S' || continuar == 's');

    }
}