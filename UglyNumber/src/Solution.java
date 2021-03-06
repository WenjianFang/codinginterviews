
public class Solution {
	public int getUglyNumber(int index){
		if(index <= 0) return 0;
		
		int[] uglyNumbers = new int[index];
		uglyNumbers[0] = 1;
		int uglyIndex = 1;
		
		int multiply2 = 0;
		int multiply3 = 0;
		int multiply5 = 0;
		
		while(uglyIndex < index){
			int min = min(uglyNumbers[multiply2]*2, uglyNumbers[multiply3]*3, uglyNumbers[multiply5]*5);
			uglyNumbers[uglyIndex] = min;
			
			while(uglyNumbers[multiply2]*2 <= uglyNumbers[uglyIndex]) multiply2++;
			while(uglyNumbers[multiply3]*3 <= uglyNumbers[uglyIndex]) multiply3++;
			while(uglyNumbers[multiply5]*5 <= uglyNumbers[uglyIndex]) multiply5++;
			
			uglyIndex++;
		}
		return uglyNumbers[uglyIndex-1];
	}
	private int min(int a, int b, int c){
		int min = a<b?a:b;
		min = min<c?min:c;
		return min;
	}
}
