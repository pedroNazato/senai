package matrizesGolle;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][3];
        int valor = 0;
        int zero = 0;
        int um = 0;
        int dois = 0;

        for(int linha = 0; linha < m.length; linha++){
            for(int coluna = 0; coluna < m.length; coluna++){

                System.out.print("| LINHA "+linha+" | COLUNA: "+coluna+": ");
                valor = input.nextInt();
                m[linha][coluna] = valor;

                if(coluna == 0){
                    zero += valor;
                }   else if(coluna == 1){
                    um += valor;
                }   else if(coluna == 2){
                    dois += valor;
                }

            }
            System.out.println();
        }

        System.out.println(" |/ SOMAS /|");
        System.out.println("soma coluna ZERO: "+zero);
        System.out.println("soma coluna UM: "+um);
        System.out.println("soma coluna DOIS: "+dois);








    }
}
