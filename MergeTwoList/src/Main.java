
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,3,14};
		int[] array2 = {1,4,24};
		ListNode head1 = createList(array1);
		ListNode head2 = createList(array2);
		ListNode p = new Solution().mergeTwoList(head1, head2);
		printList(p);
	}

	private static void printList(ListNode head){
		if(head == null){
			System.out.println("list is null");
			return;
		}
		ListNode p = head;
		while(p != null){
			System.out.print(p.val+" ");
			p = p.next;
		}
		
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
