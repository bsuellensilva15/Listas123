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
public class Exercicio5 {

    public static void main(String[] args) {
        int n1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        n1 = entrada.nextInt();

        int quadrado;
        quadrado = (n1 * n1);
        System.out.println("Resultado do quadrado é:" + quadrado);
    }

}
