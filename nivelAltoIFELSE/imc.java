package nivelAltoIFELSE;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INFORME SEU PESO: ");
        double peso = input.nextDouble();

        System.out.println("INFORME SUA ALTURA: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("CÁLCULO DO IMC: "+imc);

    }
}
