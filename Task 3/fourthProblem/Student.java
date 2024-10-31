package fourthProblem;

public class Student extends Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 7 && age < 30) {
            this.age = age;
        }
    }

    @Override
    public void print(){
        super.print();
        System.out.println("your age is: " + getAge());
    }

}
