package provaHenrique;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INFORME A MEDIDA DA MÁQUINA 1: ");
        int m1 = input.nextInt();

        System.out.println("INFORME A MEDIDA DA MÁQUINA 2: ");
        int m2 = input.nextInt();

        System.out.println("INFORME A MEDIDA DA MÁQUINA 3: ");
        int m3 = input.nextInt();

        if(m1 == m2 && m2 == m3){
            System.out.println("AS MÁQUINAS ESTÃO COM A MESMA PRECISÃO");
        }   else if(m1 != m2 && m2 == m3 || m1 != m3 && m1 == m2 || m1 == m3 && m3 != m2){
            System.out.println("UMA DAS MÁQUINAS PRECISA SER AJUSTADA");
        }   else if(m1 != m2 && m2 != m3){
            System.out.println("TODAS AS MÁQUINAS PRECISAM DE AJUSTE");
        }






    }
}
