//Faça um Programa que peça um número e então mostre
//a mensagem O número informado foi [número].

import java.util.Scanner;

public class ex002 {
   public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);

      System.out.println("Informe um numero: ");

      float a = leitor.nextFloat();

      System.out.println("O numero digitado foi: "+a);

      leitor.close();
   }
}
