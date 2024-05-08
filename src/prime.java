public class prime {
    public boolean isPrime(int a) {
        // Handling the case where 'a' is less than or equal to 1
        if (a <= 1) {
            return false;
        }

        // Checking for divisibility by numbers from 2 to sqrt(a)
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false; // 'a' is divisible by 'i', hence not prime
            }
        }
        return true; // 'a' is not divisible by any number, hence prime
    }

    public static void main(String[] args) {
        prime number = new prime();
        int num = 5;
        boolean result = number.isPrime(num);
        System.out.println(num + " is prime: " + result);
    }
}
