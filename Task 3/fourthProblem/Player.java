package fourthProblem;

public class Player extends Person {


    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0 && number <= 99){
            this.number=number;
        }
    }

    @Override
    public void print(){
        super.print();
        System.out.println("your number is: " + getNumber());
    }
}
