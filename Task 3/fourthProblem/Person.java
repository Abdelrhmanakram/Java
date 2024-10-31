package fourthProblem;

public class Person {

    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        if (id > 0) {
            Id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("your id is: " + getId() + " - your name is: " + getName());
    }
}
