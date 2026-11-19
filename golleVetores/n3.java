package golleVetores;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior = vetor[0];

        for (int atual = 0; atual < vetor.length; atual++){

            System.out.println("INFORME O VALOR DO ÍNDICE "+atual+": ");
            int valor = input.nextInt();
            vetor[atual] = valor;

        }

        for(int i = 0; i < vetor.length; i++){

            if(vetor[i] > maior){
                maior = vetor[i];
            }

        } // for


        System.out.println("MAIOR VALOR: "+ maior);














    }
}
