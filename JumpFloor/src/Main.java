
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 2;
		int ret = new Solution().jumpFloor(target);
		System.out.println(ret + "  " + Math.pow(2, target-1));
	}

}
