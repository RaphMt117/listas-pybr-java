//Tendo como dados de entrada a altura de uma pessoa,
//construa um algoritmo que calcule seu peso ideal,
//usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float h = leitor.nextFloat();

        float pesoi = ((h*72.2f)-58);
        System.out.println("Seu peso ideal e: "+pesoi);

        leitor.close();
    }
}

