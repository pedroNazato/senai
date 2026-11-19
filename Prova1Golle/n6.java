package Prova1Golle;

import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("INFORME A TEMPERATURA DA SALA: ");
        int temperatura = input.nextInt();

        if(temperatura>30){
            System.out.println("TEMPERATURA ALTA! Ligar o ar-condicionado.");
        }   else {
            System.out.println("Temperatura agradável.");
        }
            input.close();
    }
}
