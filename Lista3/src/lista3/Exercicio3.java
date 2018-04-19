/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

/**
 *
 * @author brenda
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int soma = 0;
        System.out.println("Os números são:");
        do {
            System.out.println(j + "/" + i);
            soma = soma + (j / i);
            i = i + 1;
            j = j + 2;
        } while (i <= 50);
        System.out.println("A soma é:" + soma);
    }

}

