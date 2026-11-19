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
            System.out.println("  ||| SEGUNDO VETOR INVERSO: "+vetorDois[i]);
            a--;
        }

        // SE OS DOIS VETORES FOREM IGUAIS
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == vetorDois[i]){
                System.out.println("VALORES IGUAIS ENCONTRADOS NO ÍNDICE "+i+" | VALOR "+vetorDois[i]);
            }
        }

        if(vetor[0] == vetorDois[0] & vetor[1] == vetorDois[1] & vetor[2] == vetorDois[2] & vetor[3] == vetorDois[3] & vetor[4] == vetorDois[4]){
            System.out.println("OS VETORES SÃO IGUAIS");
        }




    }
}
