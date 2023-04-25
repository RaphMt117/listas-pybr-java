/* Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("<F> para feminino\n<M> para masculino\nDigite um sexo:  ");
        String a = sc.next();

        switch (a){
            case "F": System.out.println("F - Feminino");
            break;
            case "M": System.out.println("M - Masculino");
            break;
            default: System.out.println("Sexo invalido.");
            break;
        }
        sc.close();
    }
}
