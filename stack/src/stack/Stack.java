package stack;

public interface Stack {
	void push(Book book);
	void pop();
	Book peek();
	boolean isEmpty();
	int size();
}
