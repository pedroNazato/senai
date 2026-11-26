package matrizesGolle;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ARRUMAR A COMPARACAO DO MENOR VALOR
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // !!!!!!!!!!!!!!!!!!


        int[][] m = new int[3][3];
        int valor = 0;
        int maior = m[0][0];
        int menor = m[0][0];
        int linhaMa = 0;
        int linhaMe = 0;
        int CoMa = 0;
        int CoMe = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){

                System.out.print("| Linha "+i+" | Coluna: "+j+": ");
                valor = input.nextInt();
                m[i][j] = valor;

                if(maior < m[i][j]){
                    maior = m[i][j];
                    linhaMa = i;
                    CoMa = j;
                }

                if(m[i][j] < menor){
                    menor = m[i][j];
                    linhaMe = i;
                    CoMe = j;
                }

            }
            System.out.println();
        }

        System.out.println("MAIOR: "+maior);
        System.out.println("Linha "+linhaMa);
        System.out.println("Coluna "+CoMa+"\n");

        System.out.println("MENOR: "+menor);
        System.out.println("Linha "+linhaMe);
        System.out.println("Coluna "+CoMe);






    }
}
