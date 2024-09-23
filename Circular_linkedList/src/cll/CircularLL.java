package cll;

public class CircularLL {
	private Node head = null;
	private int length = 0;
	
	private class Node{
		public Music music;
		public Node next = null;
		
		public Node(Music music) {
			this.music = music;
		}
	}
	
	void insertFirst(Music music) {
		Node nodo = new Node(music);
		if(head == null) {
			head = nodo;
			nodo.next = nodo;
		} else {
			Node current = head;
			while(current.next != head) { //last node
				current = current.next;
			}
			
			current.next = nodo;
			nodo.next = head;
			head = nodo;
		}
		length++;
	}
	
	void insert(int n, Music music) {
		if(n < 0 || n > length) {
			System.out.println("out of range");
			return;
		}
		
		Node nodo = new Node(music);
		if(n == 0) {
			insertFirst(music);
			return;
		}
		
		Node current = head;
		int i = 0;
		while(i < (n -1 ) && current.next != head) {
			current = current.next;
			i++;
		}
		
		nodo.next = current.next;
		current.next = nodo;
		length++;
		
	}
	
	void insertLast(Music music) {
		if(head == null) {
			insertFirst(music);
			return;
		}
		
		Node nodo = new Node(music);
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		
		nodo.next = head; //new node -> head
		current.next = nodo; //last node -> new node
		length++;
	}
	
	void deleteFirst() {
		if(head == null) {
			return;
		}
		
		if(head.next == head) { //one node
			head = null;
		} else {
			Node current = head;
			while(current.next != head) {
				current = current.next;
			}
			
			current.next = head.next;
			head = head.next;
		}
		length--;
	}
	
	void delete(int n) {
		if(head == null) {
			return;
		}
		
		if(n < length) {
			if(n == 0) {
				deleteFirst(); 
			} 
			Node current = head;
			int i = 0;
			while(i < (n - 1) && current.next != head) {
				current = current.next;
				i++;
			}
				
			Node temp = current.next;
			current.next = temp.next;
				
			if(temp == head) {
				head = current.next;
			}
				
			temp.next = null;
			length--;	
		}
	}
	
	void deleteLast() {
		System.out.println("llamara");
		if(head == null) {
			return;
		}
		//one node
		if(head.next == head) {
			head = null;
			length--;
			return;
		}
		
		Node current = head;
		while(current.next.next != head) {
			current = current.next;
		}
		
		Node temp = current.next;
		current.next = head;
		temp.next = null;
		length--;
	}
		
	Music printList() {
		if(head == null){ return null; }
		
		Node current = head;
		int i = 0;
		do {
			System.out.println(i+" "+current.music);
			current = current.next;
			i++;
		} while(current != head);
		
		return current.music;
	}
	
	Music search(int n) {
		if(head == null || n > length) {return null;}
		
		Node current = head;
		int i = 0;
		do {
			if(i == n) {
				System.out.println(i+" "+current.music);
				return current.music;
			}
			current = current.next;
			i++;
		} while(current != head);
		
		return null;
	}
	
	int size() { 
		return length; 
	}
	
	void clear() {
		head = null;
		length = 0;
	}
}