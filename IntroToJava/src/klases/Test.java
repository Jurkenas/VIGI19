package klases;

public class Test {
    private int argument1;
    private int argument2;
    private String argument3;

    public Test(int argument1, int argument2, String argument3) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
    }

    public Test() {
    }

    @Override
    public String toString() {
        return "klases.Test{" +
                "argument1=" + argument1 +
                ", argument2=" + argument2 +
                '}';
    }

    public int getArgument1() {
        return argument1;
    }

    public void setArgument1(int argument1) {
        this.argument1 = argument1;
    }

    public int getArgument2() {
        return argument2;
    }

    public void setArgument2(int argument2) {
        this.argument2 = argument2;
    }

    public String getArgument3() {
        return argument3;
    }

    public void setArgument3(String argument3) {
        this.argument3 = argument3;
    }
}
