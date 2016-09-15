/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) return null;
        
        /*construct a->a'->b->b'->...->n->n'*/
        constructNewList(pHead);
        //Main.traverseList(pHead);
        connectSiblings(pHead);
        //Main.traverseList(pHead);
        RandomListNode cloneHead = clonedList(pHead);
        //Main.traverseList(cloneHead);
        return cloneHead;
    }
    
    private void constructNewList(RandomListNode pHead){
    	if(pHead==null) return;
    	RandomListNode p = pHead;
    	while(p != null){/*copy each p node and add to the p's next*/
    		RandomListNode newNode = new RandomListNode(p.label);
    		newNode.next = p.next;
    		newNode.random = null;
    		p.next = newNode;
    		
    		p = p.next.next;
    	}
    }
    
    private void connectSiblings(RandomListNode pHead){
    	RandomListNode p = pHead;
    	while(p != null){/*is p's random is NOT null, its random's next is its next's random*/
    		if(p.random != null) p.next.random = p.random.next;
    		p = p.next.next;
    	}
    }
    
    private RandomListNode clonedList(RandomListNode pHead){
    	if(pHead == null) return null;
    	
    	RandomListNode cloneHead = pHead.next;/*cloned list from pHead's next start*/
    	RandomListNode p = pHead;
    	p = p.next.next;
    	RandomListNode pClone = cloneHead;
    	while(p != null){/*pick when jump 2 nodes*/
    		pClone.next = p.next;
    		p = p.next.next;
    		pClone = pClone.next;
    	}
    	return cloneHead;
    }
}

