package provaHenrique;

import java.sql.SQLOutput;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "o"; int totalVendas = 0; int comissaoFinal = 0; double comissao = 0; int comissaoDez = 0;
        double maiorComissao = 0;

        System.out.println("INFORME QUANTOS VENDEDORES SERÃO ANALISADOS: ");
        int vendedores = input.nextInt();

        for(vendedores = vendedores; vendedores>=1; vendedores--){

            System.out.println("\nINSIRA O NOME DO VENDEDOR "+vendedores+": ");
            nome = input.next();

            System.out.println("INFORME O VALOR TOTAL DE VENDAS ESTE MÊS: ");
            totalVendas = input.nextInt();

            if(totalVendas<=2000){

                comissao = totalVendas * 0.05;

                comissaoFinal += comissao;

                if(maiorComissao<comissao){
                    maiorComissao = comissao;
                }

                System.out.println("\nNOME DO VENDEDOR: "+nome);
                System.out.println("VALOR TOTAL DE VENDAS ESTE MÊS: "+totalVendas);
                System.out.println("COMISSÃO DE 5% (R$"+comissao+")");

            }   else if(totalVendas<=5000){

                comissao = totalVendas * 0.08;

                comissaoFinal += comissao;

                if(maiorComissao<comissao){
                    maiorComissao = comissao;
                }

                System.out.println("\nNOME DO VENDEDOR: "+nome);
                System.out.println("VALOR TOTAL DE VENDAS ESTE MÊS: "+totalVendas);
                System.out.println("COMISSÃO DE 8% (R$"+comissao+")");

            }   else if(totalVendas>=5001){

                comissaoDez++;

                comissao = totalVendas * 0.1;

                comissaoFinal += comissao;

                if(maiorComissao<comissao){
                    maiorComissao = comissao;
                }

                System.out.println("\nNOME DO VENDEDOR: "+nome);
                System.out.println("VALOR TOTAL DE VENDAS ESTE MÊS: "+totalVendas);
                System.out.println("COMISSÃO DE 10% (R$"+comissao+")");
            }
            // limite entre else if e for
        }

        System.out.println("\n||RELATÓRIO FINAL: ||");
        System.out.println("MAIOR COMISSÃO PAGA: "+maiorComissao);
        System.out.println("TOTAL DE COMISSÃO PAGO AOS FUNCIONÁRIOS: "+comissaoFinal);
        System.out.println("QUANTIDADE DE FUNCIONÁRIOS COM COMISSÃO DE 10%: "+comissaoDez);



    }
}
