/* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float a = sc.nextFloat();

        if (a>0){
            System.out.println("O numero digitado e positivo.");
        }else if(a<0){
            System.out.println("O numero digitado e negativo.");
        }else if(a==0){
            System.out.println("O numero digitado e neutro.");
        }
        sc.close();
    }
    
}
