package golle7VetoresExtra;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LER 5 INTEIROS E GUARDAR NUM VETOR
        // 1. MOSTRAR OS VALORES ARMAZENADOS
        // 2. APRESENTAR QUANTOS NUMEROS SAO PARES E IMPARES
        // 3. INFORMAR EM QUAL INDICE ESTAO OS VALORES PARES
        // 4. APRESENTAR QUANTOS NUMEROS SAO POSITIVOS, NEGATIVOS E ZEROS

        // CRIAR O VETOR
        int vetor[] = new int[5];

        // LOOP PARA PEGAR OS 5 NUMEROS
        for(int i = 0; i < vetor.length; i++){

            System.out.print("INFORME O VALOR DO ÍNDICE "+i+": ");
            int valor = input.nextInt();

            vetor[i] = valor;
        }   // for

        // COMANDO A
        System.out.println("\n| COMANDO a\nNÚMEROS DIGITADOS EM ORDEM: ");

        for(int i = 0; i < vetor.length; i++){
            System.out.println("| " + i + ": " + vetor[i] );
        }   // for

        // COMANDO B
        System.out.println("\n| COMANDO b\nQUANTIDADE DE PARES & ÍMPARES: ");

        int par = 0;
        int impar = 0;

        for(int i = 0; i < vetor.length; i++){

            double resto = vetor[i] % 2;

            if(resto == 0){
                par++;
            }   else {
                impar++;
            }
        }   // for

        System.out.println("PARES: "+par+"\nÍMPARES: "+impar);

        // COMANDO C
        System.out.println("\n| COMANDO c\nÍNDICE DOS PARES: ");

        for(int i = 0; i < vetor.length; i++){

            double resto = vetor[i] % 2;

            if(resto == 0){
                System.out.println(" - VALOR PAR ENCONTRADO NO ÍNDICE "+i+". VALOR: "+vetor[i]);
            }
        }   // for

        // COMANDO D
        System.out.println("\n| COMANDO d\nQUANTIDADE DE POSITIVOS, NEGATIVOS E ZEROs: ");

        int positivo = 0;
        int negativo = 0;
        int zero = 0;

        for(int i = 0; i < vetor.length; i++){

            if(vetor[i] < 0){
                negativo++;
            }   else if(vetor[i] > 0){
                positivo++;
            }   else if(vetor[i] == 0){
                zero++;
            }
        }   // for

        System.out.println("POSITIVOS: "+positivo+"\nNEGATIVOS: "+negativo+"\nZEROS: "+zero);



    }   // main
}
