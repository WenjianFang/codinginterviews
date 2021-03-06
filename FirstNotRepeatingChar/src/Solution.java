/*use an array to store the occur times of every char
 * use char-'0' as index
 */
public class Solution {
	public int getIndexOfFirstNotRepeatingChar(String str){
		if(str.length()==0) return -1;
		int[] times = new int[256];
		for(int i=0; i<256; i++) times[i]=0;/*init to 0*/
		for(int i=0; i<str.length(); i++){
			times[str.charAt(i)-'0']+=1;/*corresponding times+1*/
		}
		
		for(int i=0; i<str.length(); i++){
			if(times[str.charAt(i)-'0']==1) return i;/*bingo*/
		}
		return -1;
		
	}
}
