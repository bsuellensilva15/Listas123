/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
import java.util.Scanner;
/**
 *
 * @author brenda
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int quant, i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos conjuntos?");
        quant = entrada.nextInt();

        for (i = 1; i <= quant; i++) {
            System.out.println("Conjunto");
            System.out.println("Digite o primeiro elemento:");
            n1 = entrada.nextInt();

            System.out.println("Digite o segundo elemento:");
            n2 = entrada.nextInt();

            System.out.println("Digite o terceiro elemento:");
            n3 = entrada.nextInt();

            int soma;
            soma = (n1 + n2 + n3);
            System.out.println("A soma é:" + soma);

            int produto;
            produto = (n1 * n2 * n3);
            System.out.println("O produto é:" + produto);

            double media;
            media = (n1 + n2 + n3 / 3);
            System.out.println("A média é:" + media);

        }

    }

}
