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
public class Exercicio9 {
    public static void main(String[] args) {
        int numprimo;
        int numdivisores = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        numprimo = entrada.nextInt();
        for (int i = 1; i <= numprimo; i++) {
            if (numprimo % i == 0) {
                numdivisores++;
            }
        }
        if (numdivisores == 2) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número é não primo");
        }
    }

}
