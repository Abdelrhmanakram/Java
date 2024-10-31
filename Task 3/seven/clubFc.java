package seven;

public class clubFc extends club{

    private int Fcode;

    public int getFcode() {
        return Fcode;
    }

    public void setFcode(int fcode) {
        Fcode = fcode;
    }

    @Override
    public void print() {
        super.print();

        System.out.println("your Fcode is:" + getFcode());
    }
}
