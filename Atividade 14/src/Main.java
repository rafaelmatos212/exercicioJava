import java.util.Scanner;

public class Main {

    //Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroA = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroB = scan.nextInt();

        if(numeroA > numeroB){
            System.out.println(numeroA + " é maior que " + numeroB);
        } else if (numeroB > numeroA){
            System.out.println(numeroB + " é maior que " + numeroA);
        } else {
            System.out.println("Números iguais.");
        }

    }
}