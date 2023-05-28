package demo;

public class linklist {
	
	Node  head;
	private int size;
	
	public linklist() {
		this.size =0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data)
		{
		  this.data = data;
		  this.next = null;
		  size++; // when new node created  then abviously size will be increased as well as 
		}
			
		
	}
		
	// toAddfirst
	void toAddFirst(String data){
		Node newNode = new Node(data);
		if(head == null) {
			
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
// addlast	
	void toAddLast(String data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			//return;
		}
		
		Node curNode = head;
		
		
		while(curNode.next !=null)
		{
			curNode = curNode.next;
		}
		
		curNode.next = newNode;
		
		
	}
	
	
	// delete first
	
	void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
		}
		
		size--;
		head = head.next;
		
	}
	
	
	
	// deletelast
	
	
	void deleteLast()
	{
		
		if(head == null) // corner case 1
		{
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		
		if(head.next == null) // corner case 2
		{
			head = null;
		}
		
		
		Node secoundlast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null)
		{
			secoundlast = secoundlast.next;
			lastNode = lastNode.next;
			
		}

		secoundlast.next = null;

	}
	
	
	
	int KinneListGSize()
	{
		return size;
		
	}
	
	
	/// delete secound last
	void deleteSecoundLast()
	{

		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		size--;
		Node node = head;
		while(node.next.next != null)
		{
			node = node.next;
		}
		
		node.next = node.next.next;
	}
	// printlist

	void printList()
	{
		if(head == null)
		{
			System.out.println("Node is Empty");
			return;
		}
		
		Node curNode = head;
		
		while(curNode != null)
		{
			System.out.println(curNode.data+" ");
			curNode = curNode.next;
		}
		
		
		
		//System.out.println("NULL");

	}

	
	
	public static void main(String[] args) {
		
		linklist list = new linklist();
		
		
		System.out.println("\t\t=============================");

		System.out.println("\t\t\tDays and My Course");
		
		System.out.println("\t\t==============================");

		
		
		/*list.toAddFirst("\nMonday : Revions Assignments");

        list.toAddLast("tuesday : Researching/PD");        
        list.toAddLast("wednesday : Researching/DSA");
        list.toAddLast("thursday : Researching/Statics");
        list.toAddLast("Friday : free");
        list.toAddLast("Saturday : Research/ICT");
        list.toAddLast("Sunday: Revision");*/
		
		list.toAddFirst("\nMonday : Revions Assignments");
		list.toAddLast("imran");
		list.toAddLast("khan");

		

        list.printList();
        System.out.print("Current Size of List: "+list.KinneListGSize()+" \n\n");
        
        //list.deleteFirst();
        list.deleteSecoundLast();
        System.out.println("After deleting values...");
        list.printList();
        System.out.print("Current Size of List: "+list.KinneListGSize()+" \n\n");


      /*  
        list.deleteFirst();
        list.printList();

        System.out.println("Current Size of List: "+list.KinneListGSize()+" \n\n");

        list.deleteLast();
        list.printList();
        
        
        System.out.println("Current Size of List: "+list.KinneListGSize()+" \n\n");

		System.out.println("=========================");


		//list.toAddLast("may be you can do better then us brother keep motivated");
		
		*/

		
		
	}

	
	
}
