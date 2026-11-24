package matrizes;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int[][] pato = new int[2][2];
       int numero;

       for(int l = 0; l <= 1; l++){
           for(int c = 0; c <= 1; c++){
               System.out.print("digite um numero: ");
               numero = input.nextInt();
               pato[l][c] = numero;
           }
       }

        for(int l = 0; l <= 1; l++){
            for(int c = 0; c <= 1; c++){
                System.out.print(pato[l][c] + " ");
            }
        }

    }// main
}
