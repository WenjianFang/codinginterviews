import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,3,6,3,2,5,5};
		int[] ret = new Solution().getNumbersAppearOnce(array);
		System.out.println(Arrays.toString(ret));
	}

}
