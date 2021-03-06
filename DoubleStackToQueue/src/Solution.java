
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	/*for push, just push to stack1*/
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.empty()){
    		/*if stack2 is empty, pop stack1's elements to push stack2 and then pop*/
    		while(!stack1.empty()){
    			stack2.push(stack1.pop());
    		}
    		return stack2.pop();
    	}
    	else{
    		return stack2.pop();
    	}
    }
}