package stack;

public class Book {
	private String name;
	private String type;
	
	Book(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getType() {
		return type;
	}
	
	void setType(String type) {
		this.type = type;
	}
}
