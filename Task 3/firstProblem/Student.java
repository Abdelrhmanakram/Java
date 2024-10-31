package firstProblem;

public class Student {

    private int Id;
    private String name;
    private int age;

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){

        System.out.println("your ID is: " + getId() + " - Your name is: " + getName() + " - your age is: " + getAge());

    }
}
