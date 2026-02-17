package FullStackJava;

public class Stack {

	int size = 5;
	int stack[] = new int [size];
	int  top = -1 ;
	
	void push(int value) {
		if (top == size-1) {
			System.out.println("Stack is Full");
		}else {
			top++;
			stack[top] = value;
			System.out.println("Push the element "+ value);
		}
	}
	void display() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			for (int i = top;i>=0; i--) {
				System.out.println("Stack value" + stack[i]);
			}
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Poped the element" + stack[top]);
			top--;
		}
	}
	void peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack value peek"+ stack[top]);
		}
	}
	public static void main(String[] args) {
		Stack s1 =new Stack();
		s1.push(12);
		s1.push(78);
		s1.push(90);
		s1.push(89);
		s1.push(110);
		s1.display();
		s1.pop();
		s1.pop();
		s1.display();
		s1.peek();
	}
}
