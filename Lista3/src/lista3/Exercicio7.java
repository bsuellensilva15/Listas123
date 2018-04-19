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
public class Exercicio7 {
    public static void main(String[] arg) {
        int aluno = 0, i;
        double media;
        double maior = 0;
        double menor = 0;
        double mediafinal = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Média do aluno");

        for (i = 1; i > 0; i++) {
            System.out.println("Digite uma média do aluno:");
            media = entrada.nextInt();
            aluno = aluno + 1;
            mediafinal = mediafinal + media;
            if (media > maior) {
                maior = media;
            }
            if (media < menor) {
                menor = media;
            }
            if (media < 0) {
                i = -1;
            }
            mediafinal = mediafinal / aluno;
            System.out.println("A média final dos alunos é:" + mediafinal);
            System.out.println("A maior média é:" + maior);
            System.out.println("A menor média é:" + menor);

        }
    }
}
