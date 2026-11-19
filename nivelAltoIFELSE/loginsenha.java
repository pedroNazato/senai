package nivelAltoIFELSE;

import java.util.Scanner;

public class loginsenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String anwserLogin = "nada"; int anwserSenha = 0;

        System.out.println("CADASTRE SEU LOGIN: ");
        String login = input.next();

        System.out.println("CADASTRE SUA SENHA: ");
        int senha = input.nextInt();

        for(int tentativas = 1; tentativas<=3; tentativas++){

            System.out.println("INSIRA SEU LOGIN: ");
            anwserLogin = input.next();

            if(anwserLogin.equals(login)){
                System.out.println("AGORA INSIRA SUA SENHA: ");
                anwserSenha = input.nextInt();

                if(anwserSenha == senha){
                    System.out.println("LOGIN BEM SUCEDIDO");
                    break;
                } else {
                    System.out.println("SENHA INVÁLIDA");
                }

            }   else {
                System.out.println("LOGIN INVÁLIDO");
            }

        }






    }
}
