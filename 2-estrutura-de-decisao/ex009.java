/* Faça um Programa que leia três números e mostre-os em ordem decrescente. */
import java.util.Scanner;

public class ex009{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    int n = 3;
    float v[] = new float [n];

    for (int i = 0; i < n; i++) {
      System.out.printf("Digite o %do numero: ", (i+1));
      v[i] = sc.nextFloat();
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (v[i] > v[j]) {
          float temp = v[i];
          v[i] = v[j];
          v[j] = temp;
        }
      }
    }

    System.out.println("--------------------------\nNumeros ordenados: ");

    for (int i = 0; i < n; i++) {
      if(i<(n-1)){
        System.out.print(v[i]+", ");
      }else{
        System.out.print(v[i]+".\n--------------------------");
      }
    }

    sc.close();
  }
}

