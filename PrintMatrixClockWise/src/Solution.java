/*one loop, one loop, and then over*/
import java.util.*;
public class Solution {
	public ArrayList<Integer> printMatrixClockWise(int[][] matrix) {
		
		ArrayList<Integer> result = new ArrayList<>();
		if(matrix.length == 0) return result;
		int count=0;
		int start = 0;
		while(count < matrix.length * matrix[0].length){
			/*from (start, start) print*/
			count = count+printOneCircle(matrix, start, result);
			start++;
		}
		return result;
	}
	private int printOneCircle(int[][] matrix, int start, ArrayList<Integer> result){
		int endX = matrix.length - start - 1;
		int endY = matrix[0].length - start -1;
		int count=0;
		/*(start, start)->(start, endY)*/
		for(int i=start; i<=endY; i++){
			result.add(matrix[start][i]);
			count++;
		}
		
		/*(start+1, endY)->(endX, endY)*/
		if(start < endX){
			for(int i=start+1; i<=endX; i++){
				result.add(matrix[i][endY]);
				count++;
			}
		}
		/*(endX, endY-1)->(endX, start)*/
		if(start < endX && start < endY){
			for(int i=endY-1; i>=start; i--){
				result.add(matrix[endX][i]);
				count++;
			}
		}
		/*(endX-1,start)->(start+1, start)*/
		if(start < endX-1 && start < endY){
			for(int i=endX-1; i>=start+1; i--){
				result.add(matrix[i][start]);
				count++;
			}
		}
		return count;
	}
}
