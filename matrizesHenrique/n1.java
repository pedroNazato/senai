package matrizesHenrique;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[13][2];
        int valor = 0;

        // INSERIR VALORES
        for(int linhas = 1; linhas <= 12; linhas++){
            for(int coluna = 1; coluna <=1; coluna++){
                System.out.print("LUCRO Do MêS "+linhas+": ");
                valor = input.nextInt();
                matriz[linhas][coluna] = valor;
            }
        }

        // PRINTAR VALORES
        for(int linhas = 1; linhas <= 12; linhas++){
            for(int coluna = 1; coluna <=1; coluna++){
                System.out.print("\n| VALOR Do MêS "+linhas+": R$"+matriz[linhas][coluna]);
            }
        }





    }
}
