package Prova1Golle;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorMaximoSolicitado = 0;
        boolean maior = false; boolean rendaMinima = false; boolean liberado = false;

        System.out.print("INFORME SUA IDADE: ");
        int idade = input.nextInt();

        while(idade<=0){
            System.out.println("IDADE INVÁLIDA");

            System.out.print("INFORME SUA IDADE: ");
            idade = input.nextInt();
        }



        System.out.print("INFORME SUA RENDA MENSAL: ");
        int renda = input.nextInt();

        while(renda<=0){
            System.out.println("RENDA INVÁLIDA");

            System.out.print("INFORME SUA RENDA MENSAL: ");
            renda = input.nextInt();
        }

        System.out.print("INFORME O VALOR SOLICITADO: ");
        int solicitado = input.nextInt();

        while(solicitado<=0){
            System.out.println("VALOR INVÁLIDO");

            System.out.print("INFORME O VALOR SOLICITADO: ");
            solicitado = input.nextInt();
        }

        valorMaximoSolicitado = renda*5;

        if(idade>=18){
           maior = true;
        }

        if(renda>=2000){
            rendaMinima = true;
        }

        if(solicitado<valorMaximoSolicitado){
            liberado = true;
        }

        if(maior && rendaMinima && liberado){
            System.out.println("EMPRÉSTIMO APROVADO");
        }   else {
            System.out.println("EMPRÉSTIMO RECUSADO");
        }



    }
}
