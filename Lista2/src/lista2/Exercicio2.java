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
public class Exercicio2 {
    public static void main(String[] args) {
        int L1;
        int L2;
        int L3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Triangulo");
        L1 = entrada.nextInt();
        L2 = entrada.nextInt();
        L3 = entrada.nextInt();
        if (L1 + L2 > L3 || L2 + L3 > L1 || L3 + L1 > L2) {
            System.out.println("É um triangulo");
        }
        if (L1 == L2 && L1 == L3) {
            System.out.println("Tres lados iguais: Equilatero");
        } else if (L1 == L2 || L1 == L3) {
            System.out.println("Dois lados iguais: Isosceles");
        } else {
            System.out.println("Tres lados diferentes: Escaleno");
        }

    }
    
}
