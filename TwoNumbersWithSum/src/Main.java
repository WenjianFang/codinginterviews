import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,4,7,11,15};
		int sum = 1;
		ArrayList<Integer> ret = new Solution().getTwoNumbersWithSum(array, sum);
		System.out.println(ret.toString());
	}

}
