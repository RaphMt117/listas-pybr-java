//Tendo como dado de entrada a altura (h) de uma pessoa, 
//construa um algoritmo que calcule seu peso ideal, 
//utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float h = leitor.nextFloat();

        System.out.println("Digite seu sexo:\n (h) - homem\n (m) - mulher");
        String sexo = leitor.next();

        switch(sexo){
            case "h": System.out.println("Seu peso ideal é: "+((72.7F*h)-58));
            break;

            case "m": System.out.println("Seu peso ideal é: "+((62.1F*h)-44.7F));
            break;

            default: System.out.println("Sexo inválido");
        }

        leitor.close();
    }
}
