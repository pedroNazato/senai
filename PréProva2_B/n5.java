package PréProva2_B;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo = 0;
        double nota = 0;
        double media = 0;

        do {

            System.out.print("INSIRA SEU CÓDIGO: ");
            codigo = input.nextInt();

            if(codigo == 0){
                break;
            }

            for (int i = 1; i <= 4; i++) {
                System.out.print("ALUNO(a) CÓDIGO " + codigo + ", INFORME SUA NOTA " + i + ": ");
                nota += input.nextInt();
            }

            media = nota / 4;

            if (media >= 7) {
                System.out.println("APROVADO");
            } else if (media < 5) {
                System.out.println("REPROVADO");
            } else {
                System.out.println("EXAME");
            }

        } while(codigo != 0);

        input.close();

    }
}