
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.push(3);
		System.out.println("min is: " + s.min());
		s.push(4);
		System.out.println("min is: " + s.min());
		s.push(2);
		System.out.println("min is: " + s.min());
		s.push(1);
		System.out.println("min is: " + s.min());
		s.pop();
		System.out.println("min is: " + s.min());
		s.pop();
		System.out.println("min is: " + s.min());
		s.push(0);
		System.out.println("min is: " + s.min());
	}

}
