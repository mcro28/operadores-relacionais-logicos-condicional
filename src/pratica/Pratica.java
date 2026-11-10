package pratica;

import java.util.Scanner;

public class Pratica {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        int numeroa = scanner.nextInt();

        System.out.println("Digite o número B: ");
        int numerob = scanner.nextInt();

        if (numeroa > numerob) {
            System.out.printf("O %s é o maior número.", numeroa);
        } else if (numeroa < numerob){
            System.out.printf("O %s é o maior número", numerob);
        } else if (numeroa == numerob) {
            System.out.println("Os números digitados são iguais!");
        } else {
            System.out.println("Ocorreu um erro, tente novamente.");
        }
    }
}

