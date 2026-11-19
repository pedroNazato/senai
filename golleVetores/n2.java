package golleVetores;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        int soma = 0;

        for(int i = 0; i < vetor.length; i++){

            System.out.println("INSIRA O VALOR DO ÍNDICE "+ i +": ");
            vetor[i] = input.nextInt();

            soma += vetor[i];

        }

        System.out.println("SOMA FINAL: "+ soma);



    }
}
