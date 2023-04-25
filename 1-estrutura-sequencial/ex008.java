//Faça um Programa que pergunte quanto você ganha por hora e o 
//número de horas trabalhadas no mês. Calcule e mostre o total 
//do seu salário no referido mês.

import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quanto voce ganha por hora: ");
        float hora = leitor.nextFloat();

        System.out.println("Digite quantas horas voce trabalha no mes: ");
        float hmes = leitor.nextFloat();

        System.out.println("O total do seu salario no mes e: "+(hora*hmes));

        leitor.close();

    }

    
}
