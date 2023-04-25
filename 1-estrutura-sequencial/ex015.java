/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
*Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para
*o Imposto de Renda, 8% para o INSS e 5% para o
* sindicato, faça um programa que nos dê:
* a -salário bruto.
* b -quanto pagou ao INSS.
* c- quanto pagou ao sindicato.
* d- o salário líquido.
* e- calcule os descontos e o salário líquido, conforme a tabela abaixo:
* + Salário Bruto : R$
* - IR (11%) : R$
* - INSS (8%) : R$
* - Sindicato ( 5%) : R$
* = Salário Liquido : R$
* Obs.: Salário Bruto - Descontos = Salário Líquido.*/


import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        //sh - salario por horas
        //hm - horas trabalhadas no mes
        //sb - salario bruto
        //sl - salario liquido 
        //de - descontos 

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quanto voce ganha por hora: ");
        float sh = leitor.nextFloat();

        System.out.println("Digite quantas horas voce trabalha no mes: ");
        float hm = leitor.nextFloat();

        float sb = sh*hm;

        //salario bruto
        System.out.println("Seu salario bruto e: R$"+sb);

        //imposo de renda
        System.out.println("Voce paga ao imposto de renda: R$"+(sb*0.11F));

        //inss
        System.out.println("Voce paga ao INSS: R$"+(sb*0.08F));

        //sindicato
        System.out.println("Voce paga ao sindicato: R$"+(sb*0.05F));

        //salario liquido
        float sl = (sb-(sb*0.11F)-(sb*0.08F)-(sb*0.05F));
        System.out.println("Seu salario liquido e: R$"+sl);

        //descontos do salario liquido
        float de = (sb*0.11F)+(sb*0.08F)+(sb*0.05F);
        System.out.println("O total de descontos e de: R$"+de);

        //tabela
        System.out.println("\n+ Salario Bruto : R$"+sb);
        System.out.println("- IR (11%) : R$"+(sb*0.11F));
        System.out.println("- INSS (8%) : R$"+(sb*0.08F));
        System.out.println("- Sindicato (5%) : R$"+(sb*0.05F));
        System.out.println("= Salario Liquido : R$"+sl);

        leitor.close();
    }
}

