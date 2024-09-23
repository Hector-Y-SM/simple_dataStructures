package stack;

public class Test {
	public static void main(String args[]) {
		MyStack myStack = new MyStack();
		
		Book b1 = new Book("1test", "Hector");
		Book b2 = new Book("2test", "Yahir");
		Book b3 = new Book("3test", "Sanchez");
		Book b4 = new Book("4test", "Martinez");
		
		stackStatus(myStack);
		myStack.push(b1);
		stackStatus(myStack);
		myStack.push(b2);
		stackStatus(myStack);
		myStack.push(b3);
		stackStatus(myStack);
		myStack.push(b4);
		stackStatus(myStack);
		System.out.println("top stack: "+myStack.peek().getName());
		myStack.clear();
		stackStatus(myStack);
	}
	
	private static void stackStatus(MyStack myStack) {
		if(myStack.isEmpty()) {
			System.out.println("stack empty");
		}else {
			System.out.println("L: "+myStack.size()+" PE: "+myStack.peek().getName());
		}
	}
}
