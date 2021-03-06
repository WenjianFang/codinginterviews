/*
 * with partition in quick sort or
 * with an set to store current least numbers
 */
import java.util.*;
public class Solution {
	public ArrayList<Integer> getLeastKNumbersWithPartition(int[] array, int k){
		ArrayList<Integer> result = new ArrayList<>();
		if(array.length==0 || k<=0 || k>array.length) return result;
		
		int start = 0;
		int end = array.length-1;
		int index = partition(array, start, end);/*partition*/
		while(index != k-1){/*k-1 is the index of k-th element*/
			if(index > k-1){
				end = index-1;
				index = partition(array, start, end);
			}
			else{
				start = index+1;
				index = partition(array, start, end);
			}
		}
		for(int i=0; i<k; i++){
			result.add(array[i]);
		}
		return result;
	}
	private int partition(int[] array, int start, int end){
		if(array.length==0) return -1;
		int pivot = array[end];/*end element as pivot*/
		int iLargerPivot = start;
		for(int i=start; i<=end; i++){
			if(array[i] < pivot){
				if(i != iLargerPivot) swap(array, i, iLargerPivot);
				iLargerPivot++;
			}
		}
		swap(array, iLargerPivot, end);
		return iLargerPivot;
	}
	private void swap(int[] array, int i, int j){
		/*exchange the element in i and j*/
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public ArrayList<Integer> getLeastKNumbersWithBottles(int[] array, int k){
		ArrayList<Integer> result = new ArrayList<>();
		if(array.length==0 || k<=0||k>array.length) return result;
		
		for(int i=0; i<array.length; i++){
			if(result.size()<k) result.add(array[i]);/*bottles are not overflow*/
			/*bottles overflow, if current value<bottls' max, exchange the maximum with current*/
			else if(max(result)>array[i]) result.set(result.indexOf((Object)max(result)), array[i]);
		}
		return result;
	}
	private int max(ArrayList<Integer> result){
		int max=result.get(0);
		for(int i=1; i<result.size(); i++){
			if(max < result.get(i)) max = result.get(i);
		}
		return max;
	}
}
