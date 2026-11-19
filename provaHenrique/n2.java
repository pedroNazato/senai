package provaHenrique;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INSIRA UM NÚMERO INTEIRO E POSITIVO PARA A CONTAGEM: ");
        int i = input.nextInt();

        for(i = i; i>=0; i--){
            System.out.println("CONTAGEM: "+i);
        }


    }
}
