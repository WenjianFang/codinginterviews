
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3};
		ListNode head = new Solution().createList(array);
		ListNode p = new Solution().isThereExistCircle(head);
		if(p!=null) System.out.println(true);
		else System.out.println(false);
		int length = new Solution().getCircleLength(head);
		System.out.println(length);
		ListNode entry = new Solution().getEntryNodeOfCircle(head);
		if(entry != null)System.out.println(entry.val);
		else System.out.println("no circle");
		
	}

}
