
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer originStr = new StringBuffer("abc");
		//char[] specifyChars = {'a','e','i','o','u'};
		char[] specifyChars = {};
		new Solution().deleteSpecifyChar(originStr, specifyChars);
		System.out.println(originStr);
	}

}
