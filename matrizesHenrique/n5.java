package matrizesHenrique;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[30][3];    // 30 pessoas; 1 linha para cada pessoa - 3 colunas: sexo; avaliacao; idade \\
        int sex = 0;
        int rate = 0;
        int age = 0;
        int rateSum = 0;
        int rateSumMale = 0;
        int newestWoman = 0;

        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.print("\n|1 = MASC|2 = FEM| SEXO: ");
                sex = input.nextInt();
                matriz[linha][coluna] = sex;

                coluna++;

                System.out.print("| 0 a 10 | AVALIAÇÃO: ");
                rate = input.nextInt();
                matriz[linha][coluna] = rate;
                rateSum += rate;

                if(sex == 1){
                    rateSumMale += rate;
                }

                coluna++;

                System.out.print("IDADE: ");
                age = input.nextInt();
                matriz[linha][coluna] = age;

                newestWoman = matriz[0][0];

            }
            System.out.println();
        }

        // PRINTs
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){

                System.out.println(matriz[linha][coluna]);

            }
            System.out.println();
        }

        // PRINTs FINAIS

        rateSum = rateSum/2;
        rateSumMale = rateSumMale/2;
        System.out.println("| média das avaliações: "+rateSum);
        System.out.println("| média das avaliações dos homens: "+rateSumMale);



























    }   // main
}
