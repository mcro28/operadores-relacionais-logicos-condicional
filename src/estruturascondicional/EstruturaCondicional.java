package estruturascondicional;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade!");

        int idade = scanner.nextInt();

        if (idade > 18 && idade <= 20) {
            System.out.println("É maior de idade!");
        }
        else if (idade == 18) {
            System.out.println("É recem adulto");
        }
        else if (idade <= 16) {
            System.out.println("É um quase adulto");
        }
        else if (idade <= 6) {
            System.out.println("É uma criança");
        }
        else if (idade <= 7 && idade <=12) {
            System.out.println("É um adolescente");
        }
        else {
            System.out.println("É um adulto barbado");
        }
    }
}
