import java.util.Scanner;

public class Main {

    /*
    Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher.
    No final informe total de homens e de mulheres;
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int sexo;
        int homem = 0;
        int mulher = 0;

        for (int i = 0; i < 56; i++) {
            System.out.println("Informe seu nome: ");
            nome = scan.next();
            System.out.println("Informe o sexo. 1 para masculino, 2 para feminino: ");
            sexo = scan.nextInt();

            if (sexo == 1) {
                System.out.println(nome + " é um homem.\n");
                homem++;

            } else if (sexo == 2) {
                System.out.println(nome + " é uma mulher.\n");
                mulher++;

            } else {
                System.out.println(nome + "\n");
            }

        }

        System.out.println("Total de homens: " + homem);
        System.out.println("Total de mulheres: " + mulher);

    }
}