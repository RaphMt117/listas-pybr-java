//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class ex005 {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma medida em metros: ");

        float a = leitor.nextFloat();

        System.out.println("A medida digitada em cm e: "+(a*100)+"cm");

        leitor.close();
    }
}

