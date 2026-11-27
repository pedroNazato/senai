package matrizesHenrique;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int matriz[][] = {
                {4, 12},
                {2, -3},
        };

        double result = 0;
        double c1 = 0;
        double c2 = 0;
        double sub = 0;

        c1 = matriz[0][0] * matriz[1][1];
        c2 = matriz[0][1] * matriz[1][0];

        sub = c1 - c2;
        result = sub;

        System.out.println("RESULTADO: "+result);








    }
}
