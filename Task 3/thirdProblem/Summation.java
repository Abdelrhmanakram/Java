package thirdProblem;

public class Summation {

    private int num1;

    private int num2;

    private int num3;

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public int sum()
    {
        int sum =0;
        if (num1 % 2==0 && num2 % 2==0 && num3 % 2==0){
            sum= num1 + num2 + num3;
        }
        return sum;

    }

    public  void print(){
        System.out.println(sum());
    }
}
