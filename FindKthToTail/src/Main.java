
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9};
		ListNode root = createList(array);
		ListNode p = new Solution().FindKthToTail(root, 6);
		if(p != null) System.out.println(p.val);
		else System.out.println("p is null");
	}

	private static ListNode createList(int[] array){
		if(array.length == 0) return null;
		ListNode root = new ListNode(array[0]);
		root.next = null;
		ListNode p = root;
		for(int i=1; i<array.length; i++){
			ListNode tmp = new ListNode(array[i]);
			tmp.next = null;
			p.next = tmp;
			p = tmp;
		}
		return root;
	}
}
