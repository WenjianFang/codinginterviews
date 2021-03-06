/*
 * this array is ordered
 * get this number's first occur
 * and get this number's last occur
 * use binary search
 */
public class Solution {
	public int getTimesOfNumber(int[] array, int k){
		if(array.length==0) return -1;
		int first = getFirstIndexOfNumber(array, k, 0, array.length-1);/*get the first index*/
		int last = getLastIndexOfNumber(array, k, 0, array.length-1);/*get the last index*/
		if(first == -1 || last == -1) return -1;
	
		return last-first+1;
	}
	private int getFirstIndexOfNumber(int[] array, int k, int start, int end){
		if(start>end) return -1;
		int left = start;
		int right = end;
		int middle;
		while(left<=right){
			middle = (left+right)/2;
			if(array[middle] == k){/*bingo k*/
				if((middle>0 && array[middle-1]!=k)||middle==0) return middle;/*first k, because it front is NOT k*/
				else right = middle-1;/*the first is on left part*/
			}
			else if(array[middle] > k){/*k is on left part*/
				right = middle-1;
			}
			else left = middle+1;/*k is on right part*/
		}
		return getFirstIndexOfNumber(array, k, left, right);/*recursively search first k's index*/
	}
	private int getLastIndexOfNumber(int[] array, int k, int start, int end){
		if(start>end) return -1;
		int left = start;
		int right = end;
		int middle;
		while(left <= right){
			middle = (left+right)/2;
			if(array[middle]==k){/**/
				if((middle<right && array[middle+1]!=k)||(middle==right)){/*its rear is NOT k, it's last k*/
					return middle;
				}
				else left = middle+1;/*last k is on right part*/
			}
			else if(array[middle]<k){/*k is on right part*/
				left = middle+1;
			}
			else right = middle-1;/*k is on left part*/
		}
		return getLastIndexOfNumber(array, k, left, right);/*recursively search k's last index*/
	}
}
