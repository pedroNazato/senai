package matrizesGolle;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int somaLinhaZero = 0;
        int somaLinhaUm = 0;
        int somaLinhaDois = 0;
        int valor = 0;
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){     // linha -- >
            for(int j = 0; j < matriz.length; j++){     // coluna ^
                                                            //    |
                System.out.print("| Linha "+i+" | Coluna "+j+": ");
                valor = input.nextInt();
                matriz[i][j] = valor;

                if(i == 0){
                    somaLinhaZero += valor;
                }   else if(i == 1){
                    somaLinhaUm += valor;
                }   else if(i == 2){
                    somaLinhaDois += valor;
                }

            }
            System.out.println();
        }

        System.out.println("   |  SOMAS  |");
        System.out.println("| soma da linha ZERO: "+somaLinhaZero);
        System.out.println("| soma da linha UM: "+somaLinhaUm);
        System.out.println("| soma da linha DOIS: "+somaLinhaDois);



    }
}
