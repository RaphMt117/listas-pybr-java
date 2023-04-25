/* 
-- Faça um programa para uma loja de tintas. 
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 
18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. 
*/

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da area a ser pintada: ");
        float area = leitor.nextFloat();

        float ltinta = area/3;
        int qtd = (int)Math.ceil(ltinta/18);

        System.out.println("Voce precisara de "+(int)Math.ceil(qtd)+" latas e o preco sera R$"+(qtd*80F));

        leitor.close();
    }
}
