package linkedlist;

public class Node {
	
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	 Node head;     //  take head Node type
	
	public  void insert(int data) {
		Node newNode = new Node(data);
		
		// if the list is empty
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			
			// traverse to the end of the list
			while(current.next != null) {
				 current = current.next;
			}
			// Append new node
			 current.next = newNode;
		}
	}
	
	// display list
	public void display() {
		Node current = head;
		
		// traverse list print the data
		while(current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);;
		list.insert(30);
		
		list.display();
	}
}
