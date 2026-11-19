package PréProva2_A;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nA1 = 0; double nA2 = 0; double nA3 = 0; double nA4 = 0; double nA5 = 0;
        double mAluno1 = 0; double mAluno2 = 0; double mAluno3 = 0; double mAluno4 = 0; double mAluno5 = 0;
        String aluno1 = "0"; String aluno2 = "0"; String aluno3 = "0"; String aluno4 = "0"; String aluno5 = "0";

        int i = 1; int y = 1;

        // ALUNO 1
        System.out.print("\n\nINSIRA SEU NOME: ");
        aluno1 = input.next();
        do {

            System.out.print("INSIRA A NOTA "+y+" DO ALUNO "+i+": ");
            nA1 += input.nextInt();

            mAluno1 = nA1/3;

            y++;

        } while(y<=3);

        if(mAluno1>=7){
            System.out.print(aluno1+" APROVADO");
        }   else if(mAluno1<6){
            System.out.print(aluno1+" REPROVADO");
        }   else {
            System.out.print(aluno1+" EXAME");
        }

        y = 1;
        i++;

        // ALUNO 2
        System.out.print("\n\nINSIRA SEU NOME: ");
        aluno2 = input.next();
        do {

            System.out.print("INSIRA A NOTA "+y+" DO ALUNO "+i+": ");
            nA2 += input.nextInt();

            mAluno2 = nA2/3;

            y++;

        } while(y<=3);

        if(mAluno2>=7){
            System.out.print(aluno2+" APROVADO");
        }   else if(mAluno1<6){
            System.out.print(aluno2+" REPROVADO");
        }   else {
            System.out.print(aluno2+" EXAME");
        }

        y = 1;
        i++;

        // ALUNO 3
        System.out.print("\n\nINSIRA SEU NOME: ");
        aluno3 = input.next();
        do {
        System.out.print("INSIRA A NOTA "+y+" DO ALUNO "+i+": ");
        nA3 += input.nextInt();

            mAluno3 = nA3/3;

        y++;

    } while(y<=3);

        if(mAluno3>=7){
            System.out.print(aluno3+ " APROVADO");
        }   else if(mAluno1<6){
            System.out.print(aluno3+" REPROVADO");
        }   else {
            System.out.print(aluno3+" EXAME");
        }

        y = 1;
        i++;
        // ALUNO 4
        System.out.print("\n\nINSIRA SEU NOME: ");
        aluno4 = input.next();
        do {
            System.out.print("INSIRA A NOTA "+y+" DO ALUNO "+i+": ");
            nA4 += input.nextInt();

            mAluno4 = nA4/3;

            y++;

        } while(y<=3);

        if(mAluno4>=7){
            System.out.print(aluno4+" APROVADO");
        }   else if(mAluno1<6){
            System.out.print(aluno4+" REPROVADO");
        }   else {
            System.out.print(aluno4+" EXAME");
        }

        y = 1;
        i++;

        // ALUNO 5
        System.out.print("\n\nINSIRA SEU NOME: ");
        aluno5 = input.next();
        do {
            System.out.print("INSIRA A NOTA "+y+" DO ALUNO "+i+": ");
            nA5 += input.nextInt();

            mAluno5 = nA5/3;




            y++;

        } while(y<=3);

        if(mAluno5>=7){
            System.out.print(aluno5+ " APROVADO");
        }   else if(mAluno1<6){
            System.out.print(aluno5+" REPROVADO");
        }   else {
            System.out.print(aluno5+" EXAME");
        }

            input.close();

    }
}
