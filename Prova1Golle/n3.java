package Prova1Golle;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("INFORME SUA IDADE: ");
        int idade = input.nextInt();

        while(idade<=0){
            System.out.println("IDADE NEGATIVA. INVÁLIDA!");

            System.out.print("INFORME SUA IDADE: ");
            idade = input.nextInt();
        }

        if(idade<=12){
            System.out.println("CATEGORIA: INFANTIL - PREÇO DO INGRESSO: R$10");
        }   else if(idade<=59){
            System.out.println("CATEGORIA: INTEIRA - PREÇO DO INGRESSO: R$20");
        }   else if(idade>=60){
            System.out.println("CATEGORIA: IDOSO - PREÇO DO INGRESSO: R$10");
        }




    }
}
