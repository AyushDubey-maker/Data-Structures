 public class LinkedList {
	 Node head;
	 Node top;
	public void add(int data) {
		 Node toAdd=new Node(data);
		 if(head==null) {
			 head=toAdd;
			 return;
		 }
		 Node temp=head;
		 
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=toAdd;
		 
		 
	 }
	 public void print() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.println(temp.data+" ");
			 temp=temp.next;
		 }
	 }
	 //Just print List in Reverse Order
	 void reversePrint(Node head) {
		 
		 if(head==null) {
			 return;
		 }
		 reversePrint(head.next);
		 System.out.println(head.data);
	 }
	 //Reverse The Linked List
	 void reverseList(Node head) {
		 if(head==null) {
			 return ;
		 }
		 Node prev=null;
		 Node curr_node=head;
		 while(curr_node!=null) {
			 Node next=curr_node.next;
			 curr_node.next=prev;
			 prev=curr_node;
			 curr_node=next;
		 }
		 System.out.println(prev.data);
	 }
	 void remove(int position) {
		 if(head==null) {
			 return;
		 }
		 Node temp=head;
		 //To Remove Head
		 if(position==0) {
			 head=temp.next;
			 return;
		 }
		 for(int i=0;temp!=null&& i<position-1;i++) {
			 temp=temp.next;
		 }
		 if(temp==null||temp.next==null) {
			 return;
		 }
		 Node next=temp.next.next;
		 temp.next=next;
	 }
	 //Remove Last Element.
	 public int removeLast() throws Exception{
		 Node temp=head;
		 if(temp==null) {
			 throw new Exception("Cannot remove last element from empty stack.");
		 }
		 if(temp.next==null) {
			 Node toRemove=head;
			 head=null;
			 return toRemove.data;
		 }
		 while(temp.next.next!=null) {
			 temp=temp.next;
			 
		 }
		 Node toRemove=temp.next;
		 return toRemove.data;
	 }
	 //isEmpty
	 public boolean isEmpty() {
		 return head==null;
	 }
	 
	 void insertAtHead(int data) {
		 Node node=new Node(data);
		 node.data=data;
		 node.next=null;
		 node.next=head;
		 head=node;
		 
	 }
	 int compareLists(Node head1,Node head2) {
		 Node temp1=head1;
		 Node temp2=head2;
		 int count1=0;
		 int count2=0;
		 int count=0;
		 while(temp1!=null) {
			 count1++;
			 temp1=temp1.next;
			 
		 }while(temp2!=null) {
			 count2++;
			 temp2=temp2.next;
		 }
		 if(count1!=count2) {
			 return 0;
		 }else {
			 while(head1!=null||head!=null) {
				 if(head1.data==head2.data) {
					 count++;
				 }
				 head1=head1.next;
				 head2=head2.next;
				 if(count==count1) {
					 return 1;
				 }else {
					 return 0;
				 }
			 }
		 }
		 return 0;
		 
	 }
	public static Node mergeLists(Node headA,Node headB) {
		 if(headA==null) {
			 return headB;
		 }if(headB==null) {
			 return headA;
		 }
		 if(headA.data<headB.data) {
			 headA.next=mergeLists(headA.next,headB);
			 return headA;
		 }else {
			 headB.next=mergeLists(headA,headB.next);
		 return headB;
		 }
	 }
	 //Insert a data at a specific position.
	 void insertAt(int position,int data) {
		 Node node=new Node(data);
		 node.data=data;
		 node.next=null;
		 if(position==0) {
			 insertAtHead(data);
		 }else {
		 Node temp=head;
		 for(int i=0;i<position-1;i++) {
			 temp=temp.next;
		 }
		 node.next=temp.next;
		 temp.next=node;
	 }
	 }
	 // Get the Last Element
	 public int getLast() throws Exception{
		 Node temp=head;
		 if(temp==null) {
			 throw new Exception("Cannot peek last element from empty stack.");
		 }
	
		 while(temp.next!=null) {
			 temp=temp.next;
			 
		 }
		
		 return temp.data;

	 }
	  int getNode(Node head,int positionFromTail) {
		 Node temp=head;
		 int counter=0;
		 while(head!=null) {
			 head=head.next;
			 if(counter<positionFromTail) {
				 counter++;
			 }else if(head!=null) {
				 temp=temp.next;
				
			 }
			 
		 }
		 return temp.data;
	 }
	   int removeDuplicates(Node head) {
		  Node node=head;
		  if(head==null) {
			  return 0;
		  }
		  while(head.next!=null) {
			  if(head.data==head.next.data) {
				  head.next=head.next.next;
			  }else {
				  head=head.next;
			  }
		  }
		  return head.data;
	  }
	   int findMergePoints(Node head1,Node head2) {
		   Node temp1=head1;
		   Node temp2=head2;
		   if(temp1==temp2) {
			  return 0;
			  }
		   temp1=temp1.next;
		   temp2=temp2.next;
		   if(temp1==null) {
			   temp1=head;
		   }else if(temp2==null) {
			   temp2=head1;
		   }
		   return temp1.data;
		   
	   }
	   //Size Of LinkedList
	   public int size() {
		   Node temp=head;
		   int count=0;
		   while(temp!=null) {
			   temp=temp.next;
			   count++;
		   }
		   return count;
	   }
     
     //Node class
  public static class Node{
	   public int data;
	   public Node next;
	   public Node(int data) {
		   this.data=data;
		   next=null;
	   }
   }
 
}
