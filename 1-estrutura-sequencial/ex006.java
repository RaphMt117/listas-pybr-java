//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        float a = leitor.nextFloat();

        System.out.println("A area do circulo e: "+(a*a)*Math.PI);

        leitor.close();
    }
}
