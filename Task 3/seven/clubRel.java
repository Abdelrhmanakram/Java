package seven;

public class clubRel extends club {

    private int Rcode;

    public int getRcode() {
        return Rcode;
    }

    public void setRcode(int rcode) {
        Rcode = rcode;
    }

    @Override
    public void print() {
        super.print();

        System.out.println("your Rcode is:" + getRcode());
    }
}
