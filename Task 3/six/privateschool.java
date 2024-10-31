package six;

public class privateschool extends School{

    private boolean isPrivate;

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }


    public void print(boolean isPrivate){
        super.print();

        if (isPrivate){
            System.out.println("your school is private");
        }else {
            System.out.println("your school is public");
        }
    }
}
