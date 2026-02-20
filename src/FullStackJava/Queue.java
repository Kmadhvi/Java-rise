package FullStackJava;

public class Queue {

	int size =5;
	int Queue[] = new int [size];
	int rear = -1;
	int front = -1;
	
	void equeue(int value) {
		if(rear == size-1) {
			System.out.println("Queue is full");
		}else {
				if(front == -1) {
					front = 0;
				}
				rear++;
				Queue[rear] =value;
				System.out.println("Insert the element"+ value);
			}
		}
	void dequeue() {
		if(front == -1 || front > rear) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Deleted element : " + Queue[front]);
			front++;
		}
	}
	void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.println(Queue[i] + " ");
            }
            //System.out.println();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1 = new Queue();
		q1.equeue(24);
		q1.equeue(90);
		q1.equeue(100);
		q1.equeue(99);
		q1.equeue(78);
		q1.equeue(34333);
		q1.display();
		q1.dequeue();
		q1.display();
		

	}

}
