package golleVetores;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ler 5 inteiros, armazenar na ordem do vetor
        // mostrar os numeros em sequencia

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++){

            System.out.println("INFORME O VALOR DO ÍNDICE "+ i +": ");
            vetor[i] = input.nextInt();

        }

        for (int i = 0; i < vetor.length; i++){

            System.out.println("ÍNDICE "+ i +", NÚMERO: "+vetor[i]);

        }








    }   // FIM
}
