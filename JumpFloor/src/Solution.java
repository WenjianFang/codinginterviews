/*
 * jump floor, each time can jump 1,2,...,n steps
 * if there are n floors, how many methods to jump
 * if first time jump 1 step, there are f(n-1) methods
 * if first time jump 2 setp, there are f(n-2) methods
 * ... there are f(n)=f(n-1)+f(n-2)+...+f(1)
 * f(n-1)=f(n-2)+...+f(1)
 * => f(n)-f(n-1)=f(n-1)=>f(n)=2*f(n-1);
 * 
 */
public class Solution {
	public int jumpFloor(int target){
		if(target<=0) return 0;
		if(target==1) return 1;
		
		int f1 = 1;
		int fn = 0;
		for(int i=2; i<=target; i++){
			fn = 2*f1;/*f(n)=2*f(n-1)*/
			f1 = fn;
		}
		return fn;
	}
}
