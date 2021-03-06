
public class Solution {
	
	public String reverseWords(String str){
		if(str.equals("")) return "";
		StringBuffer sb = new StringBuffer(str);
		sb = reverseString(sb, 0, sb.length()-1);
		
		int start=0;
		int end=0;
		while(end<sb.length()){
			if((sb.charAt(end)==' ')){/*one word, reverse*/
				reverseString(sb, start, end-1);
				start = end+1;
				end = end+1;
			}
			else if(end==sb.length()-1){/*last word,reverse*/
				reverseString(sb, start, end);
				break;
			}
			else{/*not a complete, end up*/
				end = end+1;
			}
		}
		return sb.toString();
	}
	
	private StringBuffer reverseString(StringBuffer str, int start, int end){
		if(str==null || start>end) return null;
		if(start==end) return str;
		
		while(start<end){
			/*exchange start and end*/
			char tmp = str.charAt(start);
			str.setCharAt(start, str.charAt(end));
			str.setCharAt(end, tmp);
			/*move on*/
			start++;
			end--;
		}
		return str;
	}
}
