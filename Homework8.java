package cop2805;

public class Homework8 {
	public class RecursiveFibonacciThread extends Thread {
	    private int n;
	    
	    public RecursiveFibonacciThread(int n) {
	        this.n = n;
	    }
	    
	    public void run() {
	        long startTime = System.currentTimeMillis();
	        int result = fibonacci(n);
	        long endTime = System.currentTimeMillis();
	        System.out.println("Fibonacci(" + n + ") = " + result + " took " + (endTime - startTime) + " ms with recursion.");
	    }
	    
	    private int fibonacci(int n) {
	        if (n == 0) return 0;
	        if (n == 1) return 1;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}

	public class DynamicFibonacciThread extends Thread {
	    private int n;
	    
	    public DynamicFibonacciThread(int n) {
	        this.n = n;
	    }
	    
	    public void run() {
	        long startTime = System.currentTimeMillis();
	        int result = fibonacci(n);
	        long endTime = System.currentTimeMillis();
	        System.out.println("Fibonacci(" + n + ") = " + result + " took " + (endTime - startTime) + " ms with dynamic programming.");
	    }
	    
	    private int fibonacci(int n) {
	        int v1 = 0, v2 = 1, v3 = 0;
	        for (int i = 2; i <= n; i++) {
	            v3 = v1 + v2;
	            v1 = v2;
	            v2 = v3;
	        }
	        return v2;
	    }
	}

		public class runner
		{
		public void main(String[] args)
		{
			RecursiveFibonacciThread recursiveThread = new RecursiveFibonacciThread(6);
			DynamicFibonacciThread dynamicThread = new DynamicFibonacciThread(6);

			recursiveThread.start();
			dynamicThread.start();
			

		}
		}
}







