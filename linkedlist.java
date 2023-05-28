package demo;

public class linkedlist 
{
	 Node head;
	 int size;
	 
	 public linkedlist() {
		// TODO Auto-generated constructor stub
		 this.size = 0;
	} 
	
	 
	 
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
			size++;
		}
		
	}
	
	void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		
		newNode.next = head;
	    head = newNode;
	}
	
	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		
		Node curNode = head;
		while(curNode != null)
		{
			curNode = curNode.next;
		}
		
		curNode.next = newNode;
		newNode.next = null;
		
	}
	
	void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	
	void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		size--;
		if(head == null)
		{
			head = null;
		}
		Node secoundLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null) {
			secoundLast = secoundLast.next;
			lastNode = lastNode.next;
		}
		
		secoundLast.next = null;
		
		
	}
	
	void deleteSecoundLast()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node target = head;
		while(target.next.next != null)
		{
		
			target = target.next;
		}
		target.next = target.next.next;
		
	}
	
	int KinneListGSize()
	{
		return size;
		
	}
	
	void display()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node curNode = head;
		while(curNode != null)
		{
			System.out.println( curNode.data+" ");
			curNode = curNode.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist list = new linkedlist();
		
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(5);
		
		list.display();
	System.out.println("hael");
		
		
	}

}
