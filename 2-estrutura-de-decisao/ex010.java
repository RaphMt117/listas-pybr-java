/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar
 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;

public class ex010{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("use: \n[M] para Matutino \n[V] para Vespertino \n[N] para Noturno");
    System.out.println("// Digite o turno que você estuda: ");

    String turno = sc.next();

    switch(turno){
      case "M":
        System.out.println("\nBom Dia!");
        break;

      case "V":
        System.out.println("\nBoa tarde!");
        break;

      case "N":
        System.out.println("\nBoa noite!");
        break;
      default:
        System.out.println("\nValor inválido!");
        break;
    }

    sc.close();
  }
}

