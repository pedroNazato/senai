package matrizesGolle;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int numero = 0;

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz.length; coluna++){

                if(linha == coluna){
                    matriz[linha][coluna] = 1;
                }   else {
                    matriz[linha][coluna] = 0;
                }

            }
        }

        for(int j = 0; j < matriz.length; j++){
            for(int i = 0; i < matriz.length; i++){

                System.out.println("linha "+j+", coluna "+i+": "+matriz[j][i]);

            }
            System.out.println();
        }


    }
}
