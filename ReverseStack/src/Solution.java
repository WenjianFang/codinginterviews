import java.util.*;
/*
 * reverse a stack, NO auxiliary space
 * recursively solve
 */
public class Solution {
	public void reverseStack(Stack<Integer> stack){
		if(stack.empty()||stack.size()==1) return;
		int top = stack.pop();
		reverseStack(stack);/*recursive*/
		addToStackBottom(stack, top);/*add to the bottom of stack*/
	}
	private void addToStackBottom(Stack<Integer> stack, int top){
		if(stack.empty()) stack.push(top);/*stack empty, push*/
		else{/*else, recursively push to the bottom*/
			int t = stack.pop();/*pop the stack element, until the bottom (end condition)*/
			addToStackBottom(stack, top);/*top add to bottom*/
			stack.push(t);/*recover the stack*/
		}
	}
}
