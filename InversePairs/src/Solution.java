import java.util.Arrays;

/*
 * base on the merge sort
 */
public class Solution {
	public int getNumberOfInversePairs(int[] array){
		if(array.length<=1) return 0;
		int[] copy = Arrays.copyOf(array, array.length);
		long count = getNumberOfInversePairsRecu(array, copy, 0, array.length-1);
		//System.out.println(Arrays.toString(array));
		//System.out.println(Arrays.toString(copy));
		return (int)(count%1000000007);
	}
	
	private long getNumberOfInversePairsRecu(int[] array, int[] copy, int start, int end){
		if(start==end) {
			copy[start] = array[start];
			return 0;
		}
		
		int middle = (start+end)/2;
		long left = getNumberOfInversePairsRecu(copy, array, start, middle);
		long right = getNumberOfInversePairsRecu(copy, array, middle+1, end);
		
		int iLastLeft = middle;/*last index of left*/
		int iLastRight = end;
		int iCopy = end;
		long count = 0;
		while(iLastLeft >= start && iLastRight >= middle+1){
			if(array[iLastLeft] > array[iLastRight]){/**/
				copy[iCopy--] = array[iLastLeft--];
				count+= iLastRight-middle;
			}
			else{
				copy[iCopy--] = array[iLastRight--];
			}
		}
		for(; iLastLeft>=start; iLastLeft--){/*left remain*/
			copy[iCopy--] = array[iLastLeft];
		}
		for(; iLastRight>=middle+1; iLastRight--){/*right remain*/
			copy[iCopy--] = array[iLastRight];
		}
		//for(int i=0; i<copy.length; i++) array[i] = copy[i];
		return left+right+count;
	}
}
