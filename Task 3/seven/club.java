package seven;

public class club  implements printClub{

    private int id;
    private String name;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void print(){
        System.out.println("your id is: " + getId() + " - your name is: " + getName() + " - your number is:" +getNumber());
    }
}
