package golle7VetoresExtra;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // VARIAVEIS
        int vetor[] = new int[5];
        double soma = 0;
        double media = 0;
        int somaP = 0;
        int somaI = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("INSIRA O VALOR DO ÍNDICE "+i+": ");
            vetor[i] = input.nextInt();
            soma += vetor[i];

            // SEPARAR PAR E IMPAR
            if(vetor[i] % 2 == 0){
                somaP += vetor[i];
            }   else {
                somaI += vetor[i];
            }
        }

        // MEDIA
        media = soma/5;
        System.out.println("MÉDIA: "+media);

        // ACIMA DA MEDIA
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > media){
                System.out.println("VALOR ACIMA DA MÉDIA: "+vetor[i]);
            }
        }

        // ABAIXO DA MEDIA
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < media){
                System.out.println("VALOR ABAIXO DA MÉDIA: "+vetor[i]+". SEU ÍNDICE: "+i);
            }
        }

        // SEPARAR PAR E IMPAR SOUT
        System.out.println("SOMA PARES: "+somaP+"\nSOMA ÍMPARES: "+somaI);



    }   // main
}
