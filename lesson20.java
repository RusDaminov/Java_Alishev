public class lesson20 {
	public static void main(String[] args) {
		Human human1 = new Human("Bob", 19);
		Human.description = "Nice";
		Human.getDescription();
		Human h1 = new Human("Valera", 23);
		h1.description = "Bad";
//		human1.setAge(21);
//		human1.setName("Jerry");
//		human1.getInfo();
	}
}

class Human {

	private String name;
	private int age;
	public static String description;
	public static int i;

	public Human(String name, int age){
	this.name = name;
	this.age = age;
	}

	public void setName(String name){this.name = name;}

	public void setAge(int age){this.age = age;}

	public static void getDescription() {
		System.out.println(description);
	}
}