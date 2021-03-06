import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		ListNode listNode = createList(arr);/*initial a list*/
		ArrayList<Integer> ret = new Solution().printListFromTailToHead(listNode);
		System.out.println(ret.toString());
	}
	private static ListNode createList(int[] arr){
		if(arr.length==0) return null;/*if array is null, return null*/
		ListNode listNode = new ListNode(arr[0]);/*create Head node*/
		listNode.next=null;
		ListNode p = listNode;/*dynamic pointer*/
		for(int i=1;i<arr.length;i++){
			ListNode tmp = new ListNode(arr[i]);/*create a list node*/
			tmp.next=null;
			p.next = tmp;
			p = tmp;
		}
		return listNode;
	}
	
}
