/*
 * recursively solve the problem
 */
import java.util.*;
public class Solution {
	//static ArrayList<Character> exist = new ArrayList<>();
	public ArrayList<String> permulationOfString(String str){
		ArrayList<String> result = new ArrayList<>();
		/*change string to char[] or strinBuffer.*/
		char[] charStr = str.toCharArray();
		
		/*string is NULL or string's length is 1*/
		if(charStr.length == 0) return result;
		if(charStr.length==1){
			result.add(str);
			return result;
		}
		/*recursively solve*/
		permutationOfStringRecu(result, charStr,0, null);
		/*sort the list*/
		Collections.sort(result);
		return result;
	} 
	
	private void permutationOfStringRecu(ArrayList<String> result, char[] charStr, int start, StringBuffer pStr){
		if(charStr.length==0) return;
		
		StringBuffer oneStr = new StringBuffer();/*stringBuffer to store one string, similar to one path*/
		if(pStr != null) oneStr.append(pStr);/*append all the parent one string*/
		/*last one char, add to result and return*/
		if(start==charStr.length-1){
			oneStr.append(charStr[start]);
			if(!result.contains(oneStr.toString())) result.add(oneStr.toString());
			return;
		}
		/*for every char, exchange*/
		for(int i=start; i<charStr.length; i++){
			char ch = charStr[i];
			charStr[i]=charStr[start];
			charStr[start] = ch;
			/*add this char to one string and recursively solve last string*/
			oneStr.append(charStr[start]);
			permutationOfStringRecu(result, charStr, start+1, oneStr);
			
			/*delete the last element*/
			oneStr.deleteCharAt(oneStr.length()-1);
			/*exchange back*/
			ch = charStr[i];
			charStr[i]=charStr[start];
			charStr[start] = ch;
		}
		return;
	}
}
