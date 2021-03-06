/*
 * from 0->n
 * if occur num<0, keep largest sum, if current sum<0, restart
 * else just keep going
 */
public class Solution {
	public int findGreatestSumOfSubArray(int[] array){
		if(array.length==0) return 0; 
		
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++){
			if(sum <= 0) sum = array[i];/*if last time sum<0, restart*/
			else sum = sum+array[i];
			
			if(sum > maxSum) maxSum = sum;
		}
		return maxSum;
	}
}
