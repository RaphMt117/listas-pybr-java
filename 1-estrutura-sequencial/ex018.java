/*Faça um programa que peça o tamanho de um arquivo para download 
(em MB) e a velocidade de um link de Internet (em Mbps), calcule 
e informe o tempo aproximado de download do arquivo usando este 
link (em minutos).*/

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho de um arquivo em MB: ");
        float mb = sc.nextFloat();

        System.out.println("Digite a velocidade de download em Mbps: ");
        float mbps = sc.nextFloat();


        System.out.printf("A velocidade estimada para download (em minutos) e de: %.2f minuto(s)", (mb/mbps)/60);

        sc.close();
    }
}
