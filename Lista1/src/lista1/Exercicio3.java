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
public class Exercicio3 {

    public static void main(String[] args) {
        int raio;
        float altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio:");
        raio = entrada.nextInt();

        System.out.println("Digite a altura:");
        altura = entrada.nextFloat();

        double volume;
        volume = (Math.PI * raio * raio * altura);
        System.out.println("O valor do volume é:" + volume);
    }

}
