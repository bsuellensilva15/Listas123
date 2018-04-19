/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;
import java.util.Scanner;
/**
 *
 * @author brenda
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("Impar");
        }

        if (numero >= 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}
    

