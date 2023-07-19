/* Faça um programa que pergunte o preço de três produtos e informe qual
 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. */
import java.util.Scanner;

public class ex008{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float p = 0;
    float menor = 0;
    int nproduto = 1;

    System.out.print("Digite o preço do 1o produto: ");
    p = sc.nextFloat();
    menor = p;

    for (int i = 2; i <= 3; i++) {

      System.out.printf("Digite o preço do %do produto: ", i);
      p = sc.nextFloat();

      if (p<menor) {
        menor = p;
        nproduto = i;
      }
    }

    System.out.printf("Compre o %do produto que custa R$%.2f", nproduto, menor);

    sc.close();
  }
}

