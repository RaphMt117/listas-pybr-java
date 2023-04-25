//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class ex004 {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");  
        float a = leitor.nextFloat();

        System.out.println("digite a segunda nota: ");  
        float b = leitor.nextFloat();

        System.out.println("digite a terceira nota: ");  
        float c = leitor.nextFloat();

        System.out.println("digite a quarta nota: ");  
        float d = leitor.nextFloat();

        System.out.println("A media das notas mostradas e: "+(a+b+c+d)/4);

        leitor.close();
    }
}
