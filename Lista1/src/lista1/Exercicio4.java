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
public class Exercicio4 {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        a = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        b = entrada.nextInt();

        int mesmovalor;
        mesmovalor = a;
        a = b;
        b = mesmovalor;
        System.out.println("O primeiro valor é:" + a);
        System.out.println("O segundo valor é:" + b);
    }

}
