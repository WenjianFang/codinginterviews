
public class Solution {
	public boolean Find(int[][] array, int target){
		if(array.length>0){/*if array is NOT null*/
			int i=0;
			int j=array[i].length-1;
			while((i<array.length)&&(j>=0)){/*i and j in the matrix*/
				if(array[i][j]==target) return true;
				else if(array[i][j]>target) j--;/*greater than target, cut this column*/
				else if(array[i][j]<target) i++;/*less than target, cut this row*/
			}
		}
		return false;
	}
}
