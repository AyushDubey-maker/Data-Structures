import LinkedList.LinkedList;

public class MyStack {
private LinkedList list=new LinkedList();

  void push(int data) {
	  list.add(data);
  }
  int pop() throws Exception {
	  if(list.isEmpty()) {
		  throw new Exception("Cannot pop further.");
	  }
	 return list.removeLast();
  }
  int peek() throws Exception{
	  if(list.isEmpty()) {
		  throw new Exception("Cannot peek further.");
	  }
	  return list.getLast();
	 
  }
  public void print() {
	  list.print();
  }
  public int size() {
	  return list.size();
	  
  }
  public boolean isEmpty() {
	  return list.isEmpty();
  }
}
