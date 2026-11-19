package PréProva2_B;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0; int posi = 0; int nega = 0;

        for(int z = 1; z<=10; z++){

            System.out.print("INSIRA UM NÚMERO AE: ");
            n = input.nextInt();

            if(n>=1){
                posi += n;
            }   else if(n<0){
                nega++;
            }

        }

        System.out.println("SOMA DOS POSITIVOS: "+posi);
        System.out.println("QUANTIDADE DE NEGATIVOS: "+nega);




    }
}
