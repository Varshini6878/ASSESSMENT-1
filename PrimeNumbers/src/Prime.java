public class Prime {
    public static void main(String[] args) {
        int n = 5;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(n + " is Prime");
     else
            System.out.println(n + " is Not Prime");
    }
}