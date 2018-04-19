/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author brenda
 */
public class Exercicio1 {

    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero:");
        n1 = entrada.nextInt();

        System.out.println("Entre com o segundo numero:");
        n2 = entrada.nextInt();

        int soma;
        soma = (n1 + n2);
        System.out.println("Soma:" + soma);

        int diferenca;
        diferenca = (n1 - n2);
        System.out.println("Diferenca:" + diferenca);

        int produto;
        produto = (n1 * n2);
        System.out.println("Produto:" + produto);

        double media;
        media = (n1 + n2 / 2);
        System.out.println("Media:" + media);
    }

}
