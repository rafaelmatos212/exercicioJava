import java.util.Scanner;

public class Main {

    /*
    Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
    Obs: tentei fazer o mais completo, com todas possibilidades mesmo entre números iguais.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Digite 3 números: ");
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();
        numero3 = scan.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 < numero3 && numero2 < numero1) {
            if (numero1 < numero3) {
                System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            }
        } else if (numero3 < numero1 && numero3 < numero2) {
            if (numero1 < numero2) {
                System.out.println(numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println(numero3 + ", " + numero2 + ", " + numero1);
            }
        } else if(numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
            if(numero1 < numero2 && numero1 == numero3){
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);
            } else if(numero1 < numero3 && numero1 == numero2) {
                System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            } else if (numero1 < numero2 && numero1 == numero3){
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);
            } else if(numero2 < numero1 && numero2 == numero3){
                System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            } else if(numero2 < numero3 && numero2 == numero1){
                System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            } else if(numero3 < numero1 && numero3 == numero2){
                System.out.println(numero3 + ", " + numero2 + ", " + numero1);
            } else {
                System.out.println(numero3 + ", " + numero1 + ", " + numero2);
            }
        }
    }
}