package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	
	//private ArrayList<String> arrayList = new ArrayList<String>();
	private ArrayList<String> arrayStack = new ArrayList();
	
	public void push(String data) {
		arrayStack.add(data);
		
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.remove(len -1);
	}
	
	public String peek() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.get(len -1);
		
	}
	
}
public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		stack.push("aaa");
		stack.push("bbb");
		
		System.out.println("[peek()] " + stack.peek());
		
		stack.push("ccc");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
