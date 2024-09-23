package runner;

public class Runner {
	private String name;
	private String lastName;
	private int age;
	
	public Runner(String name, String lastName ,int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getRunnerName(){ return name; }
	public void setRunnerName(String name){ this.name = name; }
	
	public String getRunnerLastName(){ return lastName; }
	public void setRunnerLastName(String lastName){ this.lastName = lastName; }
	
	public int getRunnerAge(){ return age; }
	public void setRunnerAge(int age){ this.age = age; }
}