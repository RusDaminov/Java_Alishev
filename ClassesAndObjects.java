public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "Roman";
        person1.setNameAndAge("Roman", 35);
//        person1.age = 35;
        person1.setName("");
        person1.setAge(-1);
        System.out.println("-"+person1.getName());
        person1.speak();
//        System.out.println("My name is "+person1.name+", "+"I am "+person1.age+" years old");
        Person person2 = new Person();
//        person2.name = "Vova";
        String s = "Vova";
        person2.setNameAndAge(s, 20);
//        person2.age = 20;
//        System.out.println("My name is "+person2.name+", "+"I am "+person2.age+" years old");
        person2.speak();
        person2.sayHello();
        int year1 = person1.calcYearsToRet();
        int year2 = person2.calcYearsToRet();
        System.out.println("1 to ret "+year1+" years");
        System.out.println("2 to ret "+year2+" years");
    }
}

class Person {
    //class can have:
    //1. data (fields)
    //2. actions (methods)
    String name;
    int age;

    public void setName(String username){
        if (username.isEmpty())
            System.out.println("wrong name");
        name = username;
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge<0)
            System.out.println("wrong age");
        age = userAge;
    }

    public int getAge(){
        return age;
    }
    void setNameAndAge(String username, int age){
        name = username;
    }

    int calcYearsToRet(){
        int years = 65-age;
        //System.out.println("years to retirement: "+years);
        return years;
    }

    void speak() {
        System.out.println("My name is " + name + ", " + "I am " + age + " years old");
    }


    void sayHello() {
        System.out.println("Hello");
    }
}