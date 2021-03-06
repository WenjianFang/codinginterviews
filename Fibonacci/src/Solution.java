/*
 * it can also be used in the jump floor problem
 * one can jump 1 or 2 step, how many methods it can jump it there are n steps.
 */
public class Solution {
	public long Fibonacci(int n) {
		if(n<=0) return 0;
		if(n==1) return 1;
		
		long f1 = 0;
		long f2 = 1;
		long fn = 0;
		for(int i=2; i<=n; i++){
			fn = f1+f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
    }

}
