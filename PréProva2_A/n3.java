package PréProva2_A;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mult = 0;

        System.out.print("INFORME O NÚMERO: ");
        int numero = input.nextInt();

        for(int i = 2; i<=8; i++){
            mult = i*numero;
            System.out.println(numero+"x"+i+": "+mult);

        }

    }
}
