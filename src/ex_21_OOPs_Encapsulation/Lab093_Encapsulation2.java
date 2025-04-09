package ex_21_OOPs_Encapsulation;

public class Lab093_Encapsulation2 {
    public static void main(String[] args) {

        ICICIBank a = new ICICIBank("Krishnan",100);
        long bal = a.getBal();
        System.out.println(bal);

    }
}
class ICICIBank {
    private String name;
    private long bal;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;

    }
}
