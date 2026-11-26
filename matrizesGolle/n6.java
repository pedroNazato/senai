package matrizesGolle;

import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int valor = 0;

        for(int linha = 0; linha < mat.length; linha++){
            for(int coluna = 0; coluna < mat.length; coluna++){

                System.out.print("Linha "+linha+" | Coluna "+coluna+": ");
                valor = input.nextInt();
                mat[linha][coluna] = valor;

            }
            System.out.println();
        }

        for(int linha = 0; linha <= 3; linha++){

                if(linha == 0){
                    System.out.println("[ "+mat[0][0]+" "+mat[0][1]+" "+mat[0][2]+" ]");
                }   else if(linha == 1){
                    System.out.println("[ "+mat[1][0]+" "+mat[1][1]+" "+mat[1][2]+" ]");
                }   else if(linha == 2){
                    System.out.println("[ "+mat[2][0]+" "+mat[2][1]+" "+mat[2][2]+" ]");
                }
        }




    }
}
