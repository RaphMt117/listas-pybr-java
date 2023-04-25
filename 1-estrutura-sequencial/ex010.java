//Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em celcius: ");
        float tempc = leitor.nextFloat();

        float temf = 32+(tempc * 1.8F);
        System.out.println("A temperatura em Fahrenheit e: "+temf);

        leitor.close();
    }
}

