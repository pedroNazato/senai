package PréProva2_A;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativo = 0;

        for(int i = 1; i<=5; i++){
            System.out.print("DIGITE UM NÚMERO: ");
            int n = input.nextInt();

            if(n<0){
                negativo++;
            }

        }

        System.out.println("VALORES NEGATIVOS: "+negativo);

    }
}
