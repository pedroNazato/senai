package nivelAltoIFELSE;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0; int n2 = 0; char operacao = '+'; double result = 0;

        System.out.print("INFORME O NÚMERO UM: ");
        n1 = input.nextInt();

        System.out.print("INFORME O NÚMERO DOIS: ");
        n2 = input.nextInt();

        System.out.println("INFORME A OPERAÇÃO DESEJADA (+, -, *, /) ");
        operacao = input.next().charAt(0);

        if(operacao == '+'){
            result = n1+n2;
        }   else if(operacao == '-'){
            result = n1-n2;
        }   else if(operacao == '*'){
            result = n1*n2;
        }   else if(operacao == '/'){
            result = n1/n2;
        }   else {
            System.out.println("ERRO");
        }

        System.out.println("RESULTADO: "+result);

    }
}
