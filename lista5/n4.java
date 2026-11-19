package lista5;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = 0; int par = 0; int impar = 0; int sub = 0;

        do {
            System.out.print("INFORME UM NÚMERO: ");
            valor = input.nextInt();

            if(valor % 2 == 0){
                par += valor;
            }   else if(valor % 2 == 1){
                impar += valor;
            }   else if(valor == 0){
                continue;
            }

        } while(valor>=1);

        sub = par - impar;

        System.out.println("RESULTADO DA SUBTRAÇÃO: "+sub);


    }
}
