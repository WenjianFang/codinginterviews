
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array = {1,2,3,4,5,3,5,#,2,#};
		//RandomListNode pHead = createComplexList(array);
		RandomListNode p1 = new RandomListNode(1);
		RandomListNode p2 = new RandomListNode(3);
		RandomListNode p3 = new RandomListNode(5);
		RandomListNode p4 = new RandomListNode(5);
		RandomListNode p5= new RandomListNode(2);
		
		p1.next=p2;p1.random=p2;
		p2.next=p3;p2.random=p4;
		p3.next=p4;p3.random=p3;
		p4.next=p5;p4.random=null;
		p5.next=null;p5.random=null;
		RandomListNode pHead = p1;
		
		traverseList(pHead);
		RandomListNode clone = new Solution().Clone(pHead);
		traverseList(clone);
	}
	private static RandomListNode createComplexList(int[] array){
		if(array.length == 0) return null;
		RandomListNode head = new RandomListNode(array[0]);
		head.next = null;
		head.random = null;
		RandomListNode p = head;
		for(int i=1; i<array.length; i++){
			RandomListNode newNode = new RandomListNode(array[i]);
			newNode.next = null;
			newNode.random = null;
			p.next = newNode;
			p = p.next;
		}
		p = head;
		RandomListNode rp = head.next;
		while(rp != null){
			rp = rp.next;
			p.random = rp;
			p = p.next;
			//rp = rp.next;
		}
		return head;
	}
	
	public static void traverseList(RandomListNode pHead){
		while(pHead != null){
			System.out.print(pHead.label);
			if(pHead.random != null) System.out.print("(->" + pHead.random.label + ")");
			else System.out.print("(->null)");
			System.out.print("->");
			pHead = pHead.next;
		}
		System.out.println("null");
	}
}
