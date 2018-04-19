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
public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Os valores dividos por 11 com resto 5 são:");
        for (int i = 1000; i < 2000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}
