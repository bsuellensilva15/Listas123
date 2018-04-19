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
public class Exercicio5 {
    public static void main(String[] args) {
        int somap = 0;
        int somai = 0;
        int num, i;
        for (i = 1; i <= 2; i++) {
            System.out.println("Digite um número:");
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();
            if (num >= 1000) {
            }
            if (num % 2 == 0) {
                somap = somap + num;
            } else {
                somai = somai + num;
            }
        }
        System.out.println("A soma dos números pares é:" + somap);
        System.out.println("A soma dos números impares é:" + somai);
    }
}
