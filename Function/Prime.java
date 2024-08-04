public class Prime {

    // public static boolean isPrime(int n) {
    //     boolean isPrime = true;
    //     for (int i = 2; i <= n - 1 - 1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
       System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(8));
        PrimeRange(30);
    }
}
