public class PrimeNumbers {
    public static void main(String[] args) {
    	int num=100;
        for (int i = 1; i <=num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <=num-1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}