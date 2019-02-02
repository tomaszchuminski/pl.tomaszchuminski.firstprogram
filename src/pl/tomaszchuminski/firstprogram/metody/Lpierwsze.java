package pl.tomaszchuminski.firstprogram.metody;

import java.util.Scanner;

public class Lpierwsze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        //int x = ;

        for (int i = x/2 + 1; i >= 1; i--) {

            //System.out.println("x= " + x);
            //System.out.println("i= " + i);
            int w = x%i;

            //System.out.println("s= " + s);
            if (w == 0 && i != 1 && x != 2) {                           //if w=0 -> l.pierwsza
                System.out.println(x + " nie jest pierwsza");
                System.out.println(i + " to pierwszy dzielnik");
                i = 0;                                                  //i=0 to break loop
            }
            if (i == 2 && w != 0) {                 //if i=2 hasnt been breaken(see above) -> i=2 and w!=0 -> l.pierwsza
                System.out.println(x + " jest pierwsza");
            }
            else if (x==1){
                System.out.println(x + " nie jest pierwsza z DEFINICJI");
                i = 0;
            }
            else if (x==2){
                System.out.println(x + " jest pierwsza");
                i = 0;
            }

        }
    }
}