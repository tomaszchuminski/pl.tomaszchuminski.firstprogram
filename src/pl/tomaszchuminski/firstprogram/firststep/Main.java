package pl.tomaszchuminski.firstprogram.firststep;

public class Main {
    public static void main(String[] args) {
        System.out.println("lol");
        int x = Integer.MAX_VALUE;
        byte b = 127;
        short s = Short.MAX_VALUE;
        System.out.println(s);
        short in = 2;
        int w = x+1;
        System.out.println(w);
        float f=1.1f;
        double d = 2.2;
        char c = 'a';
        String str = "wjidwjidwodjwcjiwcc";

//----------------------------------------------------
        System.out.println("sum =" + (w+d));
        System.out.println("ddddd =" + (in++));
        System.out.println("qwer =" + (in));
        System.out.println("qwer =" + (++in));
        //----------------const

        final int STAL_A = 12;
        System.out.println("stata =" + (STAL_A));

        //var abc = 123; java 10

    }
}
