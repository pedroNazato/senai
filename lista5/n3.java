package lista5;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo = 0;
        double totalUm = 0;
        double totalDois = 0;
        double totalAtendimentos = 0;
        int um = 0;
        int dois = 0;
        double mediaUm = 0;
        double mediaDois = 0;

        do {
            totalAtendimentos++;
            System.out.print("INFORME O CÓDIGO DO ATENDIMENTO: ");
            codigo = input.nextInt();
            {
                if (codigo <= 0) {
                    totalAtendimentos--;
                    continue;
                } else if (codigo == 1) {
                    totalUm++;
                    um++;
                } else if (codigo == 2) {
                    totalDois++;
                    dois++;
                }
            }
        } while (codigo >= 1);

        mediaUm = (um/totalAtendimentos) * 100;
        mediaDois = (dois /totalAtendimentos) * 100;

        System.out.println("\nTOTAL ATENDIMENTOS: "+totalAtendimentos);
        System.out.println("TOTAL DE ATENDIMENTO EM CÃES: "+um);
        System.out.println("TOTAL DE ATENDIMENTO EM GATOS: "+dois);
        System.out.println("PERCENTUAL DE ATENDIMENTOS CÃES: "+mediaUm+"%");
        System.out.println("PERCENTUAL DE ATENDIMENTOS GATOS: "+mediaDois+"%");


    }
}
