
public class Solution {
	public String replaceSpace(StringBuffer str){
		
		if(str.length()==0) return str.toString();/*str is null*/
		int blankNum = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==' ') blankNum++;/*calc blank number*/
		}
		
		int indexOfOriginal=str.length();
		int indexOfNew=str.length()+blankNum*2;
		
		str.setLength(indexOfNew+1);/*change the stringbuffer's length*/
		
		while((indexOfOriginal>=0)&&(indexOfOriginal<indexOfNew)){
			if(str.charAt(indexOfOriginal)==' '){
				str.setCharAt(indexOfNew--, '0');
				str.setCharAt(indexOfNew--, '2');
				str.setCharAt(indexOfNew--, '%');
			}
			else{
				str.setCharAt(indexOfNew, str.charAt(indexOfOriginal));
				indexOfNew--;
			}
			indexOfOriginal--;
		}
		return str.toString();
		/*actually it can be solved by one line code*/
//		return str.toString().replaceAll(" ", "%20");
		
	}
}
