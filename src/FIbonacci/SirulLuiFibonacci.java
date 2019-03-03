package FIbonacci;

public class SirulLuiFibonacci {
    public static void main(String[] args) {
        getFib(0);
        System.out.println(getFib(6));
    }

    public static int getFib(int n) {
        int t1 = 0;
        int t2 = 1;
        int s = 0;

        for(int i = 2; i <= n; ++i) {
            s = t1 + t2;
            t1 = t2;
            t2 = s;
        }
        return s;
    }
}