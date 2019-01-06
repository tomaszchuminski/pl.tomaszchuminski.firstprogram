package pl.tomaszchuminski.firstprogram.conditions;

public class Switch {
    public static void main(String[] args) {
        int menu = 0;

        switch (menu) {
            case 1:
                System.out.println("main menu");
                break;
            case 2:
                System.out.println("game menu");
                break;
            case 3:
                System.out.println("exit");
                break;
            default:
                System.out.println("brak");
                break;
        }
    }
}
