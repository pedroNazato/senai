package golle7VetoresExtra;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];
        boolean encontrado = false;
        int continuar = 0;

            for (int i = 0; i < vetor.length; i++) {
                System.out.print("INFORME O ÍNDICE " + i + ": ");
                vetor[i] = input.nextInt();
            }

            do{

                System.out.println("DIGITE 1 PARA VERIFICAR A EXISTÊNCIA DE UM VALOR NO VETOR, OU 0(ZERO) PARA CESSAR");
                continuar = input.nextInt();
                if(continuar == 0){
                    break;
                }

            System.out.print("INSIRA UM VALOR PARA SER PESQUISADO NO VETOR: ");
            int desejado = input.nextInt();

            int ocorrencias = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == desejado) {
                    encontrado = true;
                    ocorrencias++;
                    System.out.println(" | ENCONTRADO");
                    if (ocorrencias >= 1) {
                        break;
                    }
                }   else {
                    encontrado = false;
                }
            }

            ocorrencias--;

            if (!encontrado) {
                System.out.println("VALOR NÃO EXISTENTE NO VETOR");
            }

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == desejado) {
                    ocorrencias++;
                }
            }

            if(ocorrencias >= 2) {
                System.out.println(ocorrencias + " OCORRÊNCIAS");
            }   else if(ocorrencias <= 1){
                continue;
            }

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == desejado) {
                    System.out.println("POSIÇÃO " + i);
                }
            }

        } while(continuar != 0);











    }
}
