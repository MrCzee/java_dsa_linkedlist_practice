package demo;

import java.util.Random;

import java.util.Scanner;
import java.util.random.*;
import demo.linklist.Node;
import java.util.stream.*;
import java.math.*;
import java.time.LocalDate;

public class Linkedl {
	
	Node  head;
	private int size;
	
    private int numofSwaps = 0;
    private int numofcompr = 0;

    Linkedl(){
    	
    	this.size = 0;
    	
    	}


	
	
	
 class Node{
	private int data;
    private	Node next;

	
	Node(int data)
	{
		this.data = data;
		this.next = null;
		size++;
	}
	
}
 

 void InsertData(int data){
		Node newNode = new Node(data);
		if(head == null) {
			
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
 
 
 void selectionSort(Node head)
 {
 	Node values = head;

 	while (values != null) {
 		Node min = values;
 		
 		Node sec = values.next;

 		while (sec != null) {
 			if (min.data > sec.data)
 			{
 				
 				min = sec;
 				numofcompr++;
 			}
 			
 			sec = sec.next;
 		}

 		numofSwaps++;
 		int x = values.data;
 		values.data = min.data;
 		min.data = x;
 		values = values.next;
 	}
 	


 	System.out.println("Number of Swaps: "+numofSwaps);
 	System.out.println("Number of compression "+numofcompr);
 }




//.................<Sorting linked list>..............//
 
 
 
 
 
 
 
 Node portitionLast(Node start, Node end)
 {
	 if(start== end || start == null || end == null)
		 return start;
	 
	 
	 Node povit_prev = start;
	  Node cur = start;
	  
	  int povit  = end.data;
	  
	  
	  while(start!= end)
	  {
		 if(start.data <povit)
		 {
			 povit_prev = cur;
			 int temp = cur.data;
			 cur.data = start.data;
			 start.data = temp;
		 }
	       start = start.next;
	       
	  }
	  
	  int temp  = cur.data;
	  cur.data = povit;
	  end.data = temp;
	 return povit_prev;
		 
 }
 
 
 void sorteed(Node start , Node end)
 {
	 if(start == null || start == end || start == end.next)
	 {
		 
		 return;
		
	 }
	 
	 
	 Node povit_prev = portitionLast(start, end);
	 sorteed(start, povit_prev);
	 
	 
	 if(povit_prev != null && povit_prev == start)
	 {
		 sorteed(povit_prev.next, end);
	 }
	 else if(povit_prev != null && povit_prev.next != null)
	 {
		 sorteed(povit_prev.next.next, end);
	 }
 }
 
 
 
 
 
 void Inserteed()
 {
	 Node first_unsorted , last_Unsorted , current , trailing;
	 if(head != null) {
		 last_Unsorted = head;
		 while(last_Unsorted.next != null)
		 {
			 first_unsorted = last_Unsorted.next;
			 if(first_unsorted.data < head.data)
			 {
				 numofcompr++;
				 last_Unsorted.next = first_unsorted.next;
				 first_unsorted.next = head;
				 head = first_unsorted;
			 }
			 else {
				 trailing = head;
				 current = trailing.next;
				 
				 while(first_unsorted.data > current.data)
				 {
					 trailing = current;
					  current = trailing.next;
				 }
				 
				 if(first_unsorted == current)
				 {
					 last_Unsorted = first_unsorted;
				 }
				 else {
					 numofSwaps++;
					 last_Unsorted.next = first_unsorted.next;
					 first_unsorted.next = current;
					 trailing.next = first_unsorted;
							
						
				 }
			 }
		 }
		 System.out.println("Number of swaps: "+numofSwaps);
		 System.out.println("Number of compressions "+numofcompr);
	 }
 }

 


void bublee()
{
	Node current = null;
	
    Node second = current.next;
    

    while (current != null) 
    {
       while (second != null) {

            if (current.data > second.data) 
            {     
                int tmp = current.data;
                current.data = second.data;
                second.data = tmp;
                numofSwaps++;

                
            }
            second = second.next;
        }
        current = current.next;
        numofcompr++;
    }
   
    System.out.println("\nNumbers of swaps: "+numofSwaps);
    System.out.println("\nNumbers of compressions: "+numofcompr);
    

   
}


void shellsort()
{
	
}



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
		System.out.println(" "+curNode.data);
		curNode = curNode.next;
	}
	
}

void printInsertion()
{
	if(head == null)
	{
		System.out.println("Node is Empty");
		return;
	}
	
	Node curNode = head;
	
	while(curNode != null)
	{
		System.out.println(" "+curNode.data);
		curNode = curNode.next;
	}
	System.out.println();
	
}

int sizelist()
{
	return size;
}

class test{
	public static void main(String[] args) {
		Linkedl list  = new Linkedl();
		
		int size = 5;
	     for(int i = 0; i < size; i++){
		   
	     Random random = new Random();

			  int d = random.nextInt(1+5);
			  
			  list.InsertData(d);
			  
	     }
	     
	     
	   
	     System.out.println("\nRandom Numbers.....");
	     list.printList();
	    
	  
	  	System.out.println("Selection Sort");
	     list.selectionSort(list.head);
	     list.printList();
	     

	  	System.out.println("Insertion Sort");
	    list.Inserteed();
	    list.printList();
	 
	     
	  	System.out.println("Bubble Sort");
	    list.bublee();
	    list.printList(); 
	    
	  	System.out.println("Quick Sort");
	  	
	  	
	  	
	  	
		Node n = list.head;
	  	
	  	while(n.next != null)
	  	{
	  		n = n.next;
	  	}
	  	
	  	list.sorteed(list.head, n);
	  	list.printList();
	}
}

}
  

