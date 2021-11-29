public class lesson19 {
	public static void main(String[] args) {
		Humanz human1 = new Humanz();
		human1.setAge(18);
		human1.setName("Tom");
		human1.getInfo();
		Humanz human2 = new Humanz();
		human2.setAge(28);
		human2.setName("John");
		human2.getInfo();
	}
}
class Humanz {
	String name;
	int age;

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void getInfo(){
		System.out.println(name+", "+age);
	}
}
