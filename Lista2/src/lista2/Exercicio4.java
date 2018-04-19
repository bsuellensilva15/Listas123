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
public class Exercicio4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        a = ler.nextInt();
        System.out.println("Digite o segundo numero:");
        b = ler.nextInt();
        System.out.println("Digite o terceiro numero:");
        c = ler.nextInt();

        if (a < b) {
            if (b < c) {
                System.out.println("Ordem crescente:" + a + "\n" + b + "\n" + c);

            } else if (a < c) {
                System.out.println("Ordem crescente:" + a + "\n" + c + "\n" + b);
            } else {
                System.out.println("Ordem crescente:" + c + "\n" + a + "\n" + b);
            }
        } else if (b < c) {
            if (a < c) {
                System.out.println("Ordem crescente:" + b + "\n" + a + "\n" + c);
            } else {
                System.out.println("Ordem crescente:" + b + "\n" + c + "\n" + a);
            }
        } else {
            System.out.println("Ordem crescente:" + c + "\n" + b + "\n" + a);
        }
        if (a < b && b < c) {
            System.out.println("Ordem decrescente:" + c + b + a);
        } else if (a < c && c < b) {
            System.out.println("Ordem decrescente:" + b + c + a);
        } else if (b < a && a < c) {
            System.out.println("Ordem decrescente:" + c + a + b);
        } else if (b < c && c < a) {
            System.out.println("Ordem decrescente:" + a + c + b);
        } else if (c < a && a < b) {
            System.out.println("Ordem decrescente:" + a + c + b);
        } else if (b < a && c < b) {
            System.out.println("Ordem decrescente:" + a + b + c);
        } else if (a < b && c < b) {
            System.out.println("Ordem decrescente:" + b + a + c);
        }

    }
    
}
