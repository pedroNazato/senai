package golle7VetoresExtra;

import java.util.Arrays;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];


        for(int i = 0; i < vetor.length; i++){
            System.out.print("ÍNDICE "+i+": ");
            vetor[i] = input.nextInt();
        }

        // MOSTRAR NA ORDEM ORIGINAL
        for(int i = 0; i < vetor.length; i++){
            System.out.println("| ORDEM ORIGINAL: "+vetor[i]);
        }

        // ORDEM INVERSA
        for(int i = 4; i >=0; i--){
            System.out.println(" || ORDEM INVERSA: "+vetor[i]);
        }

        // CRIAR SEGUNDO VETOR
        int vetorDois[] = new int[5];
        int a = 4;

        for(int i = 0; i < vetor.length; i++){
            vetorDois[i] = vetor[a];

            System.out.println("  ||| SEGUNDO VETOR INVERSO: "+vetorDois);

        }




    }
}
