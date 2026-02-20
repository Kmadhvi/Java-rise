package FullStackJava;

public class CircularQueue {
	
	int size =5;
	int Cqueue[] = new int[size];
	int front = -1;
	int rear = -1;
	
	void equeue(int value) {
		if(front == (rear+1)% size) {
			System.out.println("Queue is full");
		}else if(front == -1) {
			front =0;
			rear = 0;
			Cqueue[rear] = value;
			System.out.println("First value inserted "+ value);
		}else {
			rear = (rear + 1) % size;
			Cqueue[rear] = value;
			System.out.println("Value inserted " + value);
		}
	}
	void dequeue() {
		if(front == -1) {
			System.out.println("Queue is empty");
		}else if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			System.out.println("Remove the element" + Cqueue[front]);
			front = (front + 1)% size;
		}
	}
	
	public static void main(String args[]) {
		
		CircularQueue c1 = new CircularQueue();
		c1.equeue(45);
		c1.equeue(34);
		c1.equeue(48);
		c1.equeue(90);
		c1.equeue(12);
		c1.equeue(11);
		c1.dequeue();
		
	}

}
