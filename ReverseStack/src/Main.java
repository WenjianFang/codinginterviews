import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		Stack<Integer> stack = new Stack<>();
		for(int e:array){
			stack.push(e);
		}
		new Solution().reverseStack(stack);
		System.out.println(stack.toString());
	}

}
