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
public class Exercicio2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.println("Tabuada:" + i);
            for (int j = 0; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
}
