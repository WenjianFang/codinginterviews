import java.util.*;
/*
 * loop pop array, if stack.peek() not equal to pop array, keep stack push
 * else just keep  pop
 */
public class Solution {
	public boolean isPopOrder(int[] pushA,int[] popA) {
		if(pushA.length==0 || popA.length == 0) return false;/*null, return false or true?*/
		Stack<Integer> stack = new Stack<>();/**/
		int pushi=0;/*index of push*/
		int popi = 0;/*index of pop*/
		for(popi=0; popi<popA.length; popi++){
			if((!stack.empty())&&(popA[popi]==stack.peek())){/*bingo, just pop and go on next*/
				stack.pop();
			}
			else{/*NOT bingo, u should push stack until the element bingo*/
				while((pushi<pushA.length)&&(pushA[pushi] != popA[popi])){
					stack.push(pushA[pushi]);
					pushi++;
				}
				if((pushi<pushA.length)&&(pushA[pushi] == popA[popi])) pushi++;/*this element bingo, should be jump*/
			}
			
		}
		if((pushi==pushA.length)&&(!stack.empty())) return false;/*there are element in stack, but push array is empty*/
		return true;
    }
}
