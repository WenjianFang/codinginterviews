/*
 * judge the legal of string
 * judge the + and -
 */
public class Solution {
	public int stringToInt(String str){
		if(str.equals("")) return 0;
		int index = 0;/*string index*/
		int result = 0;
		int signal = 1;
		/*decide the signal of result*/
		if(str.charAt(index)=='-'){
			signal = -1;
			index++;
		}
		else if(str.charAt(index)=='+') index++;
		/*legal input and result = result*10+currentNum*/
		for(; index<str.length(); index++){
			if(str.charAt(index)>'9' || str.charAt(index)<'0') return 0;
			else{
				result = result*10 + (str.charAt(index)-'0');
			}
		}
		return result*signal;
	}
}
