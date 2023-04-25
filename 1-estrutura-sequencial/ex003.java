//Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class ex003 {
 public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um numero: ");

    float a = leitor.nextFloat();

    System.out.println("Digite outro numero: ");

    float b = leitor.nextFloat();

    System.out.println("A soma dos dois numeros e: "+(a+b));

    leitor.close();
  }
}

