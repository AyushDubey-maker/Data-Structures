import LinkedList.LinkedList.Node;

public class MyQueue<E> {

private Node head,rear;
public void enqueue(int data) {
	Node toAdd=new Node(data);
	if(head==null) {
		head=rear=toAdd;
		return;
	}
	rear.next=toAdd;
	rear=rear.next;
}
public int dequeue() {
	if(head==null) {
		return 0;
	}
	Node temp=head;
	head=head.next;
	if(head==null) {
		rear=null;
	}
	return temp.data;
}
public void print() {
	 Node temp=head;
	 while(temp!=null) {
		 System.out.println(temp.data+" ");
		 temp=temp.next;
	 }
}
public int peek() {
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	return temp.data;
}

}
