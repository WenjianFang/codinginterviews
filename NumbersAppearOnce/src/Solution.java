/*
 * NOR and then find the first bit of 1's index
 * cut the array with this position is 1 or not
 */
public class Solution {
	public int[] getNumbersAppearOnce(int[] array){
		
		if(array.length <=1) return null;
		int[] result = new int[2];
		int resultNOR = 0;
		for(int i=0; i<array.length; i++){
			resultNOR ^= array[i];/*NOR all the numbers*/
		}
		
		int indexOfBit1 = getIndexOfBit1(resultNOR);/*find the bit 1's index in result of NOR*/
		for(int i=0; i<array.length; i++){
			if(isBit1OfIndex(array[i],indexOfBit1)) result[0]^=array[i];
			else result[1]^=array[i];
		}
		return result;
	}
	private int getIndexOfBit1(int resultNOR){
		int index=0;
		while((resultNOR&1)==0){/*the last bit is not 1*/
			resultNOR = resultNOR >> 1;/*move right*/
			index++;
		}
		return index;
	}
	private boolean isBit1OfIndex(int num, int index){
		num = num>>index;/*move index length*/
		if((num & 1)==1) return true;
		return false;
	}
}
