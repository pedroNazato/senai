package matrizesHenrique;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];

        int valor = 0;

        int s1 = 0;
        int s2 = 0;

        for(int li = 0; li < m1.length; li++){
            for(int co = 0; co < m1.length; co++){
                System.out.print("| Linha "+li+" | Coluna "+co+": ");
               valor = input.nextInt();
               m1[li][co] = valor;
               s1 += valor;
            }
        }

        System.out.println();

        for(int li = 0; li < m2.length; li++){
            for(int co = 0; co < m2.length; co++){
                System.out.print("| Linha "+li+" | Coluna "+co+": ");
                valor = input.nextInt();
                m2[li][co] = valor;
                s2 += valor;
            }
        }

        int soma = 0;
        soma = s1 + s2;

        System.out.println("\n| SOMA DAS MATRIZES: "+soma+" |");







    }
}
