package demo;

import java.util.Scanner;
import java.util.LinkedList;

public class link {
	private Node head;
	private int size;
	
	
	class Node{
		int data;
		Node next;
		
	Node(int data)
	{
		this.data = data;
		this.next = null;
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
	
	void addLast(int data)
	{
		Node newNode = new Node(data);
		
		
	}
public static void main(String[] args) {
	link link = new link();
	
	
	
	
	
}
}
