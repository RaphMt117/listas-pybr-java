/* Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0;

        for (int i = 1; i <= 2; i++) {
            if (i==1){
                System.out.println("Digite a primeira nota: ");
                n1 = sc.nextFloat();
            }else if(i==2){
                System.out.println("Digite a segunda nota: ");
                n2 = sc.nextFloat();
            }
        }
        float media = (n1+n2)/2;
        if (media == 10){
            System.out.println("Aprovado com Distinção, media "+media);
        }else if(media<7){
            System.out.println("Reprovado, media "+media);
        }else if(media >= 7 && media != 10){
            System.out.println("Aprovado, media "+media);
        }

        sc.close();
    }
}
