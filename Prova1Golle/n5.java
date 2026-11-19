package Prova1Golle;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoTotalConsumo = 0; double consumo = 0; double precoFinal = 0; double desconto = 0;

        System.out.print("INFORME O CONSUMO MENSAL DE kWh DE ENERGIA: ");
        consumo = input.nextDouble();

        while(consumo<=0) {

            if (consumo <= 0) {
                System.out.println("VALOR INVÁLIDO.");
            }

            System.out.print("INFORME O CONSUMO MENSAL DE kWh DE ENERGIA: ");
            consumo = input.nextDouble();

        }
        precoTotalConsumo = consumo * 0.8;

        if(consumo>200){

            System.out.println("0% DE DESCONTO. PREÇO FINAL A SER PAGO: "+precoTotalConsumo);

        }   else if (consumo>=100 && consumo<=200){

            desconto = precoTotalConsumo * 0.1;

            precoFinal = precoTotalConsumo - desconto;

            System.out.println("VALOR SEM O DESCONTO: R$"+precoTotalConsumo);
            System.out.println("DESCONTO APLICADO: 10%");
            System.out.println("VALOR DESCONTO: R$"+desconto);
            System.out.println("VALOR FINAL: "+precoFinal);
        }   else if (consumo<100){

            desconto = precoTotalConsumo * 0.2;

            precoFinal = precoTotalConsumo - desconto;

            System.out.println("VALOR SEM O DESCONTO: R$"+precoTotalConsumo);
            System.out.println("DESCONTO APLICADO: 20%");
            System.out.println("VALOR DESCONTO: R$"+desconto);
            System.out.println("VALOR FINAL: "+precoFinal);
        }

        input.close();
    }
}
