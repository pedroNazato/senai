package golleVetores;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++){

            System.out.println("INFORME O VALOR DO ÍNDICE "+i+": ");
            vetor[i] = input.nextInt();

        } // for

        for(int i = 4; i <= 4; i--){

            System.out.println("ÍNDICE "+i+": "+vetor[i]);

        }




    }
}
