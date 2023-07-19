/* Faça um Programa que leia três números e mostre o maior deles. */

import java.util.Scanner;

public class ex006{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        float v[] = new float[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.printf("informe o %2do. valor: ", (i+1));
            v[i] = sc.nextFloat();
        }

        float maior = v[0];

        for (i = 0; i < n; i++) {
          if(v[i]>maior){
            maior = v[i];
          }
        }

        System.out.println("---------------------------");
        System.out.printf("\n");
        for (i=0; i<n; i++) {
          if (v[i] == maior){
            System.out.printf("%do valor = %2f <--- maior valor\n", (i+1), v[i]);
          }else{
          System.out.printf("%do valor = %2f\n", (i+1), v[i]);
          }
        }

        System.out.println("---------------------------");

        sc.close();
    }
}

