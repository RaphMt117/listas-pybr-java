// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// a) o produto do dobro do primeiro com metade do segundo .
// b) a soma do triplo do primeiro com o terceiro.
// c) o terceiro elevado ao cubo.

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int a = leitor.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int b = leitor.nextInt();

        System.out.println("Digite um numero real: ");
        float c = leitor.nextFloat();

        System.out.println("a) o produto do dobro do primeiro com metade do segundo:\n"+(a*2)*(b/2));
        System.out.println("b) a soma do triplo do primeiro com o terceiro:\n"+(a*3)+c);
        System.out.println("c) o terceiro elevado ao cubo:\n"+(Math.cbrt(c)));

        leitor.close();
    }
}
