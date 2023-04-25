/* Faça um Programa que verifique se uma letra digitada é vogal ou consoante. */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String a = sc.next();

        switch (a){
            case "a": System.out.println("A letra digitada e vogal.");
            break;
            case "e": System.out.println("A letra digitada e vogal.");
            break;
            case "i": System.out.println("A letra digitada e vogal.");
            break;
            case "o": System.out.println("A letra digitada e vogal.");
            break;
            case "u": System.out.println("A letra digitada e vogal.");
            break;
            case "A": System.out.println("A letra digitada e vogal.");
            break;
            case "E": System.out.println("A letra digitada e vogal.");
            break;
            case "I": System.out.println("A letra digitada e vogal.");
            break;
            case "O": System.out.println("A letra digitada e vogal.");
            break;
            case "U": System.out.println("A letra digitada e vogal.");
            break;
            default: System.out.println("A letra digitada e consoante.");
            break;
        }
        sc.close();
    }
}
