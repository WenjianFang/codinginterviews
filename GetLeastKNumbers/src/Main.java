import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,5,4,3,2};
		ArrayList<Integer> ret = new Solution().getLeastKNumbersWithBottles(array, 1);
		System.out.println(ret.toString());
	}

}
