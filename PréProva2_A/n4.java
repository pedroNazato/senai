package PréProva2_A;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adolescente = 0; int adulto = 0;  int i = 1;
        int faixa = 0;  int idade = 0; double somaAdolescente = 0; double somaAdulto = 0;

        for(i = 1; i<=10; i++){

            System.out.print("INSIRA SUA FAIXA ETÁRIA: ");
            faixa = input.nextInt();

            while(faixa<=0 || faixa>=3){
                System.out.println("FAIXA INVÁLIDA");

                System.out.print("INSIRA SUA FAIXA ETÁRIA: ");
                faixa = input.nextInt();
            }

            if(faixa == 1){
                adulto++;
            }   else if(faixa == 2){
                adolescente++;
            }

            System.out.print("AGORA, INSIRA SUA IDADE: ");
            idade = input.nextInt();

            if(idade<=18){
                somaAdolescente += idade;
            }   else if(idade>=19){
                somaAdulto += idade;
            }



        }


        double mediaAdulto = somaAdulto/adulto;
        double mediaAdolescente = somaAdolescente/adolescente;

        System.out.println("QUANTIDADE DE ADOLESCENTES: "+adolescente);
        System.out.println("QUANTIDADE DE ADULTOS: "+adulto);
        System.out.println("MÉDIA DE IDADE DOS ADULTOS: "+mediaAdulto);
        System.out.println("MÉDIA DE IDADE DOS ADOLESCENTES: "+mediaAdolescente);

        input.close();
    }
}