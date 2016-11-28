
public class Human {
	private String name;
	private int age;
	
	public Human(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	
	public String toString(){
		return ("이름: " + name + ", 나이: " + age);
	}
}
