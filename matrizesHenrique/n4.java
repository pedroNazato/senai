package matrizesHenrique;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };

        int somaCasas = 0;

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 3; coluna <= 3; coluna++){
                coluna--;

                somaCasas += matriz[linha][2];

            }
        }

        System.out.println("soma casas: "+somaCasas);



    }
}
