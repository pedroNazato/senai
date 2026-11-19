package Prova1Golle;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int precoFinal = 0;

        System.out.print("INFORME A QUANTIDADE DE CAIXAS: ");
        int caixas = input.nextInt();

        while(caixas<=0){
            System.out.println("QUANTIDADE INVÁLIDA");

            System.out.print("INFORME A QUANTIDADE DE CAIXAS: ");
            caixas = input.nextInt();
        }

        if(caixas == 1){
            precoFinal = caixas*15;
        }   else if(caixas>=2){
            precoFinal = caixas*12;
        }

        System.out.println("VALOR FINAL: R$"+precoFinal);


    }
}
