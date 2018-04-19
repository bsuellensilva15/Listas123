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
public class Exercicio3 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota");
        nota3 = entrada.nextDouble();

        double maior;
        maior = nota1;

        if (nota1 > nota2 && nota1 > nota3) {
            System.out.println("A MAIOR É:" + nota1);
        } else {
            maior = nota1;
        }
        if (nota2 > nota1 && nota2 > nota3) {
            System.out.println("A MAIOR É:" + nota2);
        } else {
            maior = nota2;
        }
        if (nota3 > nota1 && nota3 > nota2) {
            System.out.println("A MAIOR É:" + nota3);
        } else {
            maior = nota3;
        }
        double media;
        media = (nota1 + nota2 + nota3 / 3);
        System.out.println("A MEDIA É:" + media);
    }

}
    

