package pedidos;

public class Queue implements QueueMethods{

	private class Nodo{
		public Order order;
		public Nodo next;
		
		public Nodo(Order order) {
			this.order = order;
		}
	}
	
	private Nodo head, last;
	private int length;
	
	@Override
	public void enqueue(Order order) {
		Nodo nodo = new Nodo(order);
		if(head == null) {
			head = nodo;
		} else {
			last.next = nodo;
		}
		last = nodo;
		length++;
	}

	@Override
	public void pop() {
		if(head != null) {
			Nodo nodoDelete = head;
			head = head.next;
			nodoDelete.next = null;
			
			if(head == null) {
				last = null;
			}
			length--;
		}
	}

	@Override
	public Order getHead() {
		if (head != null) {
			return head.order;
		}
		return null;
	}

	@Override
	public Order get(int n) {
		if(head != null || n > length) {
			Nodo nodo = head;
			int i = 0;
			while(i < n) {
				nodo = nodo.next;
				i++;
			}
			return nodo.order;
		}
		return null;
	}
	
	void clear() {
		head = null;
		last = null;
		length = 0;
	}
	
	int size() {
		return length;
	}
	
	boolean isEmpty() {
		return head == null;
	}

}
