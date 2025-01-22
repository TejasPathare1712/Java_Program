
public class PrimeNumber extends Thread {
	public void run() {
		
		 for (int i = 1; i <= 100; i++) {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	            if (isPrime(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    private static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}

}
