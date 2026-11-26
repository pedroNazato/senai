package matrizesGolle;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;
        int valor = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){

                System.out.print("valor da linha "+i+" da coluna "+j+": ");
                valor = input.nextInt();
                soma += valor;
                matriz[i][j] = valor;

            }
            System.out.println();
        }

        System.out.println("| SOMA: "+soma);







    }
}
