package basic.recursion;

public class NTo1 {

    static void printNTo1(int n) {
        if(n==0) return;

        printNTo1(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
       printNTo1(5);
    }
}
