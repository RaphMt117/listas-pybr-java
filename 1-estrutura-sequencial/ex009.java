//Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        float tempf = leitor.nextFloat();
        
        float tempc = 5*((tempf-32)/9);

        System.out.println("A temperatura digitada em celcius e: "+tempc);
        
        leitor.close();
    }
    
}
