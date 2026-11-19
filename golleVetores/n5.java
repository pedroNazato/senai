package golleVetores;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        boolean achou = false;

        for(int i = 0; i < vetor.length; i++){

            System.out.println("INFORME O ÍNDICE "+i+": ");
            vetor[i] = input.nextInt();

        } // for

        do{

            System.out.println("INFORME O NÚMERO A SER PROCURADO: ");
            int procurado = input.nextInt();

            for(int i = 0; i < vetor.length; i++){

                if(procurado == vetor[i]){
                    achou = true;
                }

            }


        } while(achou == false);

        System.out.println("NÚMERO ENCONTRADO");







    } // fim
}
