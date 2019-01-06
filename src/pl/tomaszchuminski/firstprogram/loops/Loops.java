package pl.tomaszchuminski.firstprogram.loops;

public class Loops {
    public static void main(String[] args) {

        for(int i = 1; i<=10; i++){
            System.out.println("nr" + i);

        }

        int j = 20;
        for(;j>10;j--){
            System.out.println("j" + j);
        }

        int[] tablica = {1,2 ,3 ,7 ,8};
        int[] ints = new int[] {1 ,2, 3, 4, 5};
        System.out.println(ints[1]);
        int z = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ",");
            z= z + ints[i];
           // System.out.println(z);

        }
        System.out.println();
        System.out.println(z);
    }
}
