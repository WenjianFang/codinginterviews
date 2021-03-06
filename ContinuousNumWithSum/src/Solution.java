import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> getContinuousArrayWithSum(int sum){
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if(sum <= 2) return result;
		
		int start=1;
		int end=2;
		int middle = (sum+1)/2;/*larger than half of sum would not possible to SUM as sum*/
		int currentSum = start+end;
		while(start<middle){/*stop when start==middle*/
			if(currentSum == sum){
				ArrayList<Integer> oneSolution = new ArrayList<>();
				for(int i=start; i<=end; i++) oneSolution.add(i);
				result.add(oneSolution);/*get one solution*/
				
				currentSum -=start;/*start out, and start step up*/
				start++;
			}
			else if(currentSum > sum){
				currentSum -=start;/*start out, and start step up*/
				start++;
			}
			else if(currentSum < sum){/*currentSum < sum, end step up and currentSum step up*/
				end++;
				currentSum +=end;
			}
		}
		return result;
	}
}
