import java.util.Scanner;

public class Main {

    /*
    Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
    imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
    maior, e uma mensagem que são diferentes.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();

        if(numero1 == numero2){
            System.out.println("Números iguais.");
        } else {
            if(numero1 > numero2){
                System.out.println(numero1 + " é maior que " + numero2);
            } else {
                System.out.println(numero2 + " é maior que " + numero1);
            }
        }

    }
}