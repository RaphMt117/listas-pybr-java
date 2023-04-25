//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o lado de um quadrado");
        float a = leitor.nextFloat();

        float area = (a*a);

        System.out.println("A area do quadrado e: "+area+", e o dobro da area e : "+(area*2));
        
        leitor.close();
    }
    
}
