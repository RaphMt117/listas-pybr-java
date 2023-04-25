/* Faça um Programa que peça dois números e imprima o maior deles. */

import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 0, b = 0;

        for (int i = 0; i < 2; i++) {
            if (i==0){
                System.out.println("Digite o primeiro numero: ");
                a = sc.nextFloat();
            }else if (i==1){
                System.out.println("Digite o segundo numero: ");
                b = sc.nextFloat();
            }
        }
        if (a>b){
            System.out.printf("O maior numero digitado foi: %.2f",a);
        }else{
            System.out.printf("O maior numero digitado foi: %.2f",b);
        }
        
        sc.close();
    }
}