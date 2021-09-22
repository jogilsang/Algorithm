public class Fibonacci {
    public int fibonacci(int n) {
        // Recursive (no dynamic programming)
        // fibonacci(0) = 0
        // fibonacci(1) = 1
        // fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)  
        if( n == 0 )
            return 0;
        if( n == 1 )
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public int fibonacciFaster(int n) {
		// Dynamic prgramming
        return fibonacciResc(int n, new int[n+1])
	}

    public int fibonacciResc(int n, int[] cache) {
		// Dynamic prgramming
        if( n == 0 || n == 1)
            return 1;
        if ( cache[n] != 0) {
            return cache[n];
        }

        cache[n] = fibonacci(n-1, cache) + fibonacci(n-2, cache);
        return cache[n];
	}

}