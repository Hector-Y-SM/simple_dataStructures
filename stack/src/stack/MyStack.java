package stack;

public class MyStack implements Stack{
	
	private class Nodo{
		Book book;
		Nodo next = null;
		
		Nodo(Book book){
			this.book = book;
		}
	}
	
	private Nodo top = null;
	private int length;
	
	@Override
	public void push(Book book) {
		Nodo nodo = new Nodo(book);
		nodo.next = top;
		top = nodo;
		length++;
	}

	@Override
	public void pop() {
		if(top != null) {
			Nodo nodoDelete = top;
			top = top.next;
			nodoDelete.next = null;
			length--;
		}
	}

	@Override
	public Book peek() {
		if(top != null) {
			return top.book;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return length == 0;
	}

	@Override
	public int size() {
		return length;
	}
	
	void clear() {
		top = null;
		length = 0;
	}

}
