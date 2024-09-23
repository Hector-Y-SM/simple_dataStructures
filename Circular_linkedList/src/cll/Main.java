package cll;

public class Main {
	public static void main(String[] args) {
		Music m1 = new Music("1test","1ext");
		Music m2 = new Music("2test","2ext");
		Music m3 = new Music("3test","3ext");
		Music m4 = new Music("4test","4ext");
		
		CircularLL cll = new CircularLL();
		cll.insertFirst(m4);
		cll.insertFirst(m3);
		cll.insertFirst(m2);
		cll.insertFirst(m1);
		cll.clear();
		cll.printList();
	}
}
