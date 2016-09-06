
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 7;
		System.out.println(array.length);
		boolean ret = new Solution().Find(array, target);
		System.out.println(ret);
	}

}
