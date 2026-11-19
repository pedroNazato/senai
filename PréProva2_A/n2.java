package PréProva2_A;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v = 0; int somaNeg = 0; int positivos = 0;

        for(int i = 1; i<=5; i++){

            System.out.print("DIGITA O NÚMERO: ");
            v = input.nextInt();

            if(v<0){
                somaNeg += v;
            }   else if(v>=1){
                positivos++;
            }

        }

        System.out.println("SOMA DOS NEGATIVOS: "+somaNeg);
        System.out.println("QUANTIDADE DE NÚMEROS POSITIVOS: "+positivos);

    }
}
