package pl.tomaszchuminski.firstprogram.metody;

import java.util.Scanner;

public class Lpierwsze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int x = scan.nextInt();
        float x = 8;

        for (float i = x; i > 0; i--) {
           // i = x;
            //System.out.println("x= " + x);
            //System.out.println("i= " + i);
            float w = x/i;
            float s = x%i;
            //System.out.println("s= " + s);
            if (w >= 2) {
                System.out.println(x + " nie jest pierwsza");
            }

        }
    }
}