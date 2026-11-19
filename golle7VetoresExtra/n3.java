package golle7VetoresExtra;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior = 0;
        int indice = 0;
        int menor = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("INSIRA O VALOR DO ÍNDICE "+i+": ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[1];

        // MAIOR
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                indice = i;
            }
        }

        // INFORMAR MAIOR
        System.out.println("MAIOR VALOR: "+maior+" | NO ÍNDICE "+indice);




        // TA ERRADO AQUI CORRIGIR
        // VERIFICAR MAIORES REPETIDOS
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == maior && vetor[i] != vetor[1]){
                System.out.println("VALORES REPETIDOS: "+vetor[i]+" | NO ÍNDICE "+i);
            }
        }
        // ERRO ERRO CORRIGIR




        menor = vetor[1];

        // MENOR
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                indice = i;
            }
        }

        // MENOR SOUT
        System.out.println("MENOR: "+menor+" | NA POSIÇÃO "+indice);






    }   // MAIN
}
