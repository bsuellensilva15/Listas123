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
public class Exercicio8 {
     public static void main(String[] args) {
        int num;
        int x = 0;
        int y = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = entrada.nextInt();
        System.out.println("Primeiros pares");
        while (x < num) {
            x++;
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
        System.out.println("Primeiros impares");
        while (y < num) {
            y++;
            if (y % 2 != 0) {
                System.out.println(y);
            }
        }
    }
}
