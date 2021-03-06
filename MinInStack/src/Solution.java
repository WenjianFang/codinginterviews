import java.util.*;


/*
 * use another stack to store current minimum number
 */
public class Solution {

	Stack<Integer> originStack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
    
    public void push(int node) {
        this.originStack.push(node);
        if(this.minStack.empty()||node < this.minStack.peek()){/*first value, or this node less than current minimum*/
        	this.minStack.push(node);
        }
        else{/*this node greater than current minimum value, push current minimum value*/
        	this.minStack.push(this.minStack.peek());
        }
    }
    
    public void pop() {
        if(this.originStack.empty()||this.minStack.empty()) return;
        this.originStack.pop();
        this.minStack.pop();
    }
    
    public int top() {
        if(this.originStack.empty()) System.out.println("empty stack");
        return this.originStack.peek();
        
    }
    
    public int min() {
        if(this.minStack.empty()) System.out.println("empty stack");
        return this.minStack.peek();
    }
}