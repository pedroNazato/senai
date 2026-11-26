package matrizesGolle;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int[][] pato = new int[3][3];
       int numero;

       for(int l = 0; l <= 3; l++){
           for(int c = 0; c <= 3; c++){
               System.out.print("digite um numero para a coluna "+c+" e linha "+l+": ");
               numero = input.nextInt();
               pato[l][c] = numero;
           }
       }

       // PRINTAR A DIAGONAL PRINCIPAL, E SOMAR OS ELEMENTOS

        int soma = 0;

        for(int l = 0; l <= 3; l++){
            for(int c = 0; c <= 3; c++){

                if(l == c){
                    System.out.println("| "+pato[l][c]+" |");
                    soma += pato[l][c];
                }

            }
        }

        System.out.println("soma: "+soma);

    }// main
}
