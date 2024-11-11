package mathematical.algorithms;

public class GCD {

    // Iterative version of GCD calculation
    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    // Recursive version of GCD calculation
    public static int gcdRec(int a, int b) {
        return a % b == 0 ? b : gcdRec(b, a % b);
    }
}
