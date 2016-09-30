/*delete specify chars
 * use two pointer, first point to the position that should be override
 * second move on
 */
public class Solution {
	public void deleteSpecifyChar(StringBuffer originStr, char[] specifyChars){
		if(specifyChars.length==0||originStr.length()==0||originStr==null) return;
		
		boolean[] chTable = new boolean[256];
		for(int i=0; i<specifyChars.length; i++){/*table to record specified chars*/
			chTable[specifyChars[i]]=true;
		}
		int j=0;
		for(int i=0; i<originStr.length(); i++){
			if(!chTable[originStr.charAt(i)]){
				if(i != j){
					originStr.setCharAt(j, originStr.charAt(i));/*the same as partition in quick sort*/
				}
				j++;
			}
		}
		originStr.setCharAt(j, '\0');
		//System.out.println(originStr.length());
		//System.out.println(originStr);
	}
}
