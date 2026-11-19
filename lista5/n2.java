package lista5;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int um = 0; int dois = 0; int tres = 0; int quatro = 0; int cinco = 0; int seis = 0; int codigo = 0;

        do {
            System.out.print("INFORME O CÓDIGO DO SEU PEDIDO: ");
            codigo = input.nextInt();

                if (codigo <= 0) {
                    continue;
                } else if (codigo == 1) {
                    um++;
                } else if (codigo == 2) {
                    dois++;
                } else if (codigo == 3) {
                    tres++;
                } else if (codigo == 4) {
                    quatro++;
                } else if (codigo == 5) {
                    cinco++;
                } else if (codigo == 6) {
                    seis++;
                }

        }   while(codigo>=1);

        System.out.println("TOTAL DE HAMBÚRGUERES: "+um);
        System.out.println("TOTAL DE CHEESEBURGUERS: "+dois);
        System.out.println("TOTAL DE CACHORROS-QUENTES: "+tres);
        System.out.println("TOTAL DE REFRIGERANTES: "+quatro);
        System.out.println("PEDIDOS CANCELADOS: "+cinco);
        System.out.println("PEDIDOS EM ABERTO: "+seis);

    }
}
