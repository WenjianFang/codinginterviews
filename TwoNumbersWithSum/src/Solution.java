/*
 * start->
 * <-end
 * currentSum<sum, start++
 * currentSum>sum, end--
 * else return
 */
import java.util.*;
public class Solution {
	public ArrayList<Integer> getTwoNumbersWithSum(int[] array, int sum){
		ArrayList<Integer> result = new ArrayList<>();
		if(array.length<=1) return result;
		int start = 0;
		int end = array.length-1;
		
		while(start<end){
			if(array[start]+array[end]==sum){/*bingo*/
				result.add(array[start]);
				result.add(array[end]);
				return result;
			}
			else if(array[start]+array[end]>sum){/*end down*/
				end--;
			}
			else if(array[start]+array[end]<sum){/*start up*/
				start++;
			}
		}
		return result;
	}
}
