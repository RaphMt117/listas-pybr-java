/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
*o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes
*maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
*deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um
*programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na
*variável excesso a quantidade de quilos além do limite e na variável multa o valor
*da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso de peixes em kg: ");
        float peso = leitor.nextFloat();

        if(peso>50){
            float ex = peso - 50;
            float multa = ex * 4;

            System.out.println("A multa a se pagar é de: R$" +multa);
            System.out.printf("O excesso foi de: %.2f kg", ex);
        }else{
            System.out.println("O peso esta dentro do regulamento.");
        }

        leitor.close();
    }
}
