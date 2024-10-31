package secondProblem;

public class Player {

    private int number;
    private String name;

    public void setName(String name) {
        if (name.length() > 5) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }

    public void print(){
        System.out.println("your Number is: " + getNumber() + " - Your name is: " + getName());
    }
}
