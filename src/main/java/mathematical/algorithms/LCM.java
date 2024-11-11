package mathematical.algorithms;

public class LCM {

    /***
     * The relationship between GCD and LCM is used here.
     * GCD (a, b) x LCM (a , b) = |a x b|
     * so, LCM (a, b) = |a x b| ÷ GCD (a, b)
     * simply, LCM (a, b) = |a ÷ GCD (a, b) x b|
     * @param a
     * @param b
     * @return lcm of (a, b)
     */
    public long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / GCD.gcdRec(a, b) * b);
    }
}
