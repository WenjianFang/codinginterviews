
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3},{4,5,6}};
		ArrayList<Integer> ret = new Solution().printMatrixClockWise(array);
		System.out.println(ret.toString());
	}

}
