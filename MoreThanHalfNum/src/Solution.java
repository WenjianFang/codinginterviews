/* solution1: use the partition in quick sort algorithm
 * index == middle is the number that more than half
 * solution2: just calc the times of number occur, the number more than half
 * would fight last
 */
public class Solution {
	public int findMoreThanHalfWithPartition(int[] array){
		if(array.length == 0) return 0;/*if not exist*/
		
		int start = 0; 
		int end = array.length-1;
		int middle = array.length/2;
		
		int index = partition(array, start, end);/*use partition to get pivot index*/
		/*if index!=middle, go to while loop, else return array[middle]*/
		while(index != middle){
			if(index > middle){/*go to left*/
				end = index-1;
				index = partition(array, start, end);
			}
			else{
				start = index+1;/*go to right*/
				index = partition(array, start, end);
			}
		}
		if(!isTimesLargerThanHalf(array, array[middle])) return 0;
		return array[middle];/*return middle num*/
	}
	private int partition(int[] array, int start, int end){
		if(array.length==0) return 0;/*if not exist*/
		
		int pivot = array[end];/*pivot choose at the end of array*/
		
		int iLargerPivot = start;/*if there are values larger than pivot, it is its index*/
		for(int i=start; i<end-1; i++){
			if(array[i]<pivot){
				if(i != iLargerPivot) swap(array, i, iLargerPivot);/*swap*/
				iLargerPivot++;/*next value larger than pivot*/
			}
		}
		swap(array, iLargerPivot, end);/*position the pivot*/
		return iLargerPivot;
	}
	private void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	private boolean isTimesLargerThanHalf(int[] array, int value){
		int times = 0;
		for(int i=0; i<array.length; i++){
			if(array[i]==value) times++;
		}
		if(times*2 > array.length) return true;
		return false;
	}
	
	public int findMoreThanHalfWithTimes(int[] array){
		if(array.length==0) return 0;
		int currentNum = array[0];
		int times = 1;
		
		for(int i=1; i<array.length; i++){
			if(array[i] == currentNum) times++;
			else times--;
			if(times == 0){
				currentNum = array[i];
				times = 1;
			}
		}
		if(!isTimesLargerThanHalf(array, currentNum)) return 0;
		return currentNum;
	}
}
