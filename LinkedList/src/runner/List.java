package runner;

public class List {
	private Nodo head;
	private int length = 0;
	
	private class Nodo {
		public Runner runner;
		public Nodo next = null;
		
		public Nodo(Runner runner) {
			this.runner = runner;
		}
	}

	public void createRunner(Runner runner) {
		Nodo nodo = new Nodo(runner);
		nodo.next = head;
		head = nodo;
		length++;
	}
	
	public void createRunnerSpecific(int n, Runner runner) {
		Nodo nodo = new Nodo(runner);		
		if(n == 0) {
			this.createRunner(runner);
			return;
		}
		
		Nodo pointer = head;
		int i = 0;
		//llegamos a una posicion a la anterior solicitada para poder insertar el nodo despues de la cabeza (la posicion deseada)
		while(i < (n - 1) && pointer.next != null) { 
			pointer = pointer.next;
			i++;
		}
		nodo.next = pointer.next;
		pointer.next = nodo;
		length++;
	}
	
	public void createRunnerFinallyList(Runner runner) {
		Nodo nodo = new Nodo(runner);
		if(head == null) {
			this.createRunner(runner);
			return;
		}
		
		Nodo pointer = head;
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		
		pointer.next = nodo;
		length++;
	}
	
	public void deleteRunner(int n) {
		if(head != null) {
			if(n <= length) {
				if(n == 0) {
					Nodo first = head;
					head = head.next;
					first.next = null;
					length--;
					return;
				}
				
				Nodo pointer = head;
				int i = 0;
				
				while(i < (n - 1)) {
					pointer = pointer.next;
					i++;
				}
				
				Nodo temp = pointer.next;
				pointer.next = temp.next;
				temp.next = null;
				length--;
				return;
			}
		}
	}
	
	public Runner getAllRunners(int n) {
		if(head == null) { return null; } 
		
		Nodo pointer = head;
		int i = 0;
		while(i < n && pointer.next != null) {
			pointer = pointer.next;
			i++;
		}
		
		if(i != n) { return null; }
		return pointer.runner; 
	}
	
	public int getRunnersLength() {
		return length;
	}
	
	public Runner getRunner(int n) {
		Nodo pointer = head;
		int i = 0;
		while(pointer != null) {
			if(i == n) {
				return pointer.runner;
			}
			pointer = pointer.next;
			i++;
		}
		return null; 
	}
}
