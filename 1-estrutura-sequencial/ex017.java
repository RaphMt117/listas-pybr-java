/*
-- Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas
de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
-- Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 3 situações:
* comprar apenas latas de 18 litros;
* comprar apenas galões de 3,6 litros;
* misturar latas e galões, de forma que o desperdício de tinta seja menor.
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
*/

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho da area a ser pintada, em m²: ");
        float area = leitor.nextFloat();

        float ltinta = area/6;
        int lata = 18;
        float galao = 3.6f;

        double qtdlata = Math.ceil(area / lata );
        double qtdgalao = Math.ceil(area / galao);

        System.out.println("--Comprando apenas em latas:\n"+qtdlata+" latas ");
        System.out.println("-Preco total de R$"+qtdlata*80);
        System.out.println("--Comprando apenas em galoes:\n"+qtdgalao+" galoes");
        System.out.println("-Preco total de R$"+qtdgalao*25);

        leitor.close();
    }
}

