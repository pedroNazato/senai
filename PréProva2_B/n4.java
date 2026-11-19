package PréProva2_B;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1 = MASCULINO // 2 = FEMININO
        int quantidadeMulheres = 0; int quantidadeHomens = 0;
        double somaIdadeMulheres = 0; double somaIdadeHomens = 0;
        double mediaMulheres = 0; double mediaHomens = 0;

        for(int i = 1; i<=4; i++){

            // PERGUNTA O SEXO (1 ou 2)
            System.out.print("INFORME SEU SEXO: ");
            int sexo = input.nextInt();

            // PERGUNTA A IDADE, PRA CALCULAR A MÉDIA
            System.out.print("AGORA, INFORME SUA IDADE: ");
            int idade = input.nextInt();


            // DECISÃO PRA SEPARAR FEMININO-MASCULINO e SOMAR A IDADE DE AMBOS NAS VARIÁVEIS
            if(sexo == 1){
                quantidadeHomens++; // ADICIONA +1 HOMEM
                somaIdadeHomens += idade; // ADICIONA A IDADE INSERIDA NO TOTAL DOS HOMENS
            } else if(sexo == 2){
                    quantidadeMulheres++; // ADICIONA +1 MULHER
                somaIdadeMulheres += idade; // SOMA A IDADE INSERIDA NO TOTAL DAS MULHERES
            }

        }

        // CÁLCULO DAS MÉDIAS DE CADA GÊNERO
        mediaMulheres = somaIdadeMulheres/quantidadeMulheres;   // DIVIDE O TOTAL DA IDADE DAS MULHERES PELO TOTAL DELAS
        mediaHomens = somaIdadeHomens/quantidadeHomens; // MEMA COISA QUE EM CIMA.

        System.out.println("QUANTIDADE TOTAL DE MULHERES: "+quantidadeMulheres);
        System.out.println("QUANTIDADE TOTAL DE HOMENS: "+quantidadeHomens);
        System.out.println("IDADE MÉDIA DAS MULHERES: "+mediaMulheres);
        System.out.println("IDADE MÉDIA DOS HOMENS: "+mediaHomens);

        input.close();
    }
}
