package PréProva2_B;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0; int i = 0; int resposta = 0;

        System.out.print("INSIRA O NUMERO: ");
        n = input.nextInt();

        do {
            i++;
            resposta = n*i;
            System.out.println(n+"x"+i+": "+resposta);






        } while(i<10);




    }
}
