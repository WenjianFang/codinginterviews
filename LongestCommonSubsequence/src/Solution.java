/*
 * two string sequence Xn={x0,x1,...xn-1}, Ym={y0,y1,...,ym-1}
 * longest common subsequence Zk={z0,z1,...zk-1}
 * xn-1=ym-1=>zk-1=xn-1=ym-1, and Zk-1 is Xn-1 and Ym-1's LCS
 * or Zk is the Xn-1 and Ym's LCS
 * or Zk is the Xn and Ym-1's LCS
 */
public class Solution {
	public String getLongestCommonSubsequence(String str1, String str2){
		if(str1.length()==0 || str2.length()==0) return null;
		int[][] c = new int[str1.length()][str2.length()];
		int[][] b = new int[str1.length()][str2.length()];
		
		for(int i=0; i<str1.length(); i++){
			for(int j=0; j<str2.length(); j++){
				/*the first character*/
				if(i==0 || j==0){
					if(str1.charAt(i)==str2.charAt(j)){
						c[i][j] = 1;
						b[i][j] = 1;
					}
					else c[i][j] = 0;
				}
				/*b[i][j] to record the direction*/
				else {
					if(str1.charAt(i)==str2.charAt(j)){
						c[i][j] = c[i-1][j-1]+1;
						b[i][j] = 1;
					}
					else if(c[i-1][j] > c[i][j-1]){
						c[i][j] = c[i-1][j];
						b[i][j] = 2;
					}
					else{
						c[i][j] = c[i][j-1];
						b[i][j] = 3;
					}
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		getLCSRecu(str1, str1.length()-1, str2.length()-1, b, sb);
		return sb.toString();
	}
	private static void getLCSRecu(String str1, int i, int j, int[][] b, StringBuffer sb){
		if(i==-1 || j==-1) return;
		if(b[i][j]==1){
			getLCSRecu(str1, i-1, j-1, b, sb);
			sb.append(str1.charAt(i));
		}
		else if(b[i][j]==2) getLCSRecu(str1, i-1, j, b, sb);
		else getLCSRecu(str1, i, j-1, b, sb);
	}
}
