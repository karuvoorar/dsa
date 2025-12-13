package bitmanipulation.patterns;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap(a, b);
    }

    private static void swap(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("A=" + a + " B=" + b);
    }
}
