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
public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite os números:");
        int maior;
        int menor;
        int num;
        Scanner entrada = new Scanner(System.in);
        maior = entrada.nextInt();
        menor = entrada.nextInt();
        for (int i = 0; i < 15; i++) {
            num = entrada.nextInt();
            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número é:" + maior);
        System.out.println("O menor número é:" + menor);
    }

}
    

