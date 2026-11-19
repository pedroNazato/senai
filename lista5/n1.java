package lista5;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso = 0; double totalPeso = 0; double mediaPeso = 0; double maiorPeso = 0;
        int idade = 0; double mediaIdade = 0; double AlunosMenorDezoito = 0; double totalIdade = 0;
        int totalAlunos = 0;
        // encerra quando informe um peso = 0;

        do {
            totalAlunos++ ;

            System.out.print("INFORME O PESO DO ALUNO "+totalAlunos+": ");
            peso = input.nextInt();

            if(peso > maiorPeso){
                maiorPeso = peso;
            }

            totalPeso += peso;

            if(peso<=0){
                continue;
            }

            System.out.print("INFORME A IDADE DO ALUNO "+totalAlunos+": ");
            idade = input.nextInt();

            totalIdade += idade;

            if(idade<=18){
                AlunosMenorDezoito++ ;
            }

        }   while(peso>=1);

        totalAlunos--;

        mediaPeso = totalPeso/totalAlunos;
        mediaIdade = totalIdade/totalAlunos;
        double porcentagemDezoitoMenos = (AlunosMenorDezoito/totalAlunos) * 100;

        System.out.println("\nMÉDIA DO PESO DOS ALUNOS "+mediaPeso+"kg");
        System.out.println("MÉDIA DAS IDADES: "+mediaIdade+" anos");
        System.out.println("MAIOR PESO REGISTRADO: "+maiorPeso+"kg");
        System.out.println("PORCENTAGEM DE ALUNOS COM 18 ANOS OU MENOS: "+porcentagemDezoitoMenos+"%");

    }
}
