package nivelAltoIFELSE;

import java.util.Scanner;

public class descontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double desconto = 0;
        double fina = 0;

        System.out.println("INFORME O VALOR DA COMPRA: ");
        double cpr = input.nextDouble();

        if(cpr<=100){
            System.out.println("DESCONTO DE 0%");
            System.out.println("VALOR FINAL: "+cpr);
        }   else if(cpr<=500){
            desconto = cpr * 0.05;
            fina = cpr-desconto;
            System.out.println("DESCONTO DE 5% "+desconto);
            System.out.println("VALOR FINAL: "+fina);
        }   else if(cpr<=1000){
            desconto = cpr*0.1;
            fina = cpr-desconto;
            System.out.println("DESCONTO DE 10% "+desconto);
            System.out.println("VALOR FINAL: "+fina);
        }   else if(cpr>=1001){
            desconto = cpr*0.15;
            fina = cpr-desconto;
            System.out.println("DESCONTO DE 15% "+desconto);
            System.out.println("VALOR FINAL: "+fina);
        }




    }
}
