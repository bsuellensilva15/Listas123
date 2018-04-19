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
public class Exercicio5 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero:");
        n3 = entrada.nextInt();

        int soma;
        soma = (n1 + n2 + n3);
        System.out.println("A soma é:" + soma);

        int multiplicacao;
        multiplicacao = (n1 * n2 * n3);
        System.out.println("A multiplicação é:" + multiplicacao);

        double media;
        media = (n1 + n2 + n3 / 3);
        System.out.println("A media é:" + media);
    }

}
    

