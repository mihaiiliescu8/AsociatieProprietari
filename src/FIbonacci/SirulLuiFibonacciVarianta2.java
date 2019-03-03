package FIbonacci;

public class SirulLuiFibonacciVarianta2 {
    public static void main(String[] args) {
        getFib(0);
        System.out.println(getFib(6));
    }

    public static int getFib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return getFib(n - 1) + getFib(n - 2);
    }
}