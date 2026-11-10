package estruturascondicional;

import java.util.Scanner;

public class EstruturaCondicionalSwitchCase {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int dia = scanner.nextInt();

        //usando if else
//        if ( dia < 1 || dia > 7){
//            System.out.println("Número inválido. digite de 1 a 7.");
//        } else {
//            System.out.println("Com if-else:");
//            if (dia == 1) {
//                System.out.println("Domingo");
//            } else if (dia == 2) {
//                System.out.println("Segunda-feira");
//            } else if (dia == 3) {
//                System.out.println("Terça-feira");
//            } else if (dia == 4) {
//                System.out.println("Quarta-feira");
//            } else if (dia == 5) {
//                System.out.println("Quinta-feira");
//            } else if (dia == 6) {
//                System.out.println("Sexta-feira");
//            } else if (dia == 7) {
//                System.out.println("Sábado");
//            }
//        }

        //Usando Switch-case
        System.out.println("Com switch-case: ");
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feria");
                break;
            case 6:
                System.out.println("Sexta_feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Digite de 1 a 7.");
        }
    }
}
