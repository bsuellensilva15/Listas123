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
public class Exercicio2 {

    public static void main(String[] args) {
        int temperaturaGraus;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus centigrados:");
        temperaturaGraus = entrada.nextInt();

        double conversao;
        conversao = (9 * temperaturaGraus + 160 / 5);
        System.out.println("Temperatura em Fahrenheit:" + conversao);
    }

}
