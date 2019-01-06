package pl.tomaszchuminski.firstprogram.metody;

public class Methods {
    public static void main(String[] args) {
        hi();
        hi("Karol", "Jacek", "Placek");
    }

    private static void hi(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + " ";
            System.out.println("Hi " + result);
        }
    }
}

