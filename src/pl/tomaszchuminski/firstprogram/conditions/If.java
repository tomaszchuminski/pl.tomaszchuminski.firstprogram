package pl.tomaszchuminski.firstprogram.conditions;
//change for git
public class If {

    public static void main(String[] args) {

        int[] ints = {1, 3, 4, 2};

        for (int i : ints) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //-----------------------------
        System.out.println();
        int tab[];
        tab = new int[1001];
       // System.out.println(tab[0]);
       // System.out.println(tab[1]);
        for (int i = 1; i <= 10; i++) {
            tab[i] = i;
           //System.out.println(tab[0]);
            if (tab[i] % 3 == 0) {
                System.out.print(tab[i] + ",");
            }
            else if (tab[i] % 7 == 0) {
                System.out.print(tab[i] + ",");
            }
            //System.out.println(tab[i]);
        }
        System.out.println();
       // System.out.println(tab[0]);
    }
}
