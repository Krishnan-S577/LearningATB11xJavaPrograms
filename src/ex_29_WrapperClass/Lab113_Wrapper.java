package ex_29_WrapperClass;

public class Lab113_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(10,"16ProMax",120000.0);
        Mobile Samsung = new Mobile(2,"S24Ultra",100000.0);
        iphone.setPrice(135000.00);
        iphone.display();
        iphone.calling();
    }
}

class Mobile extends oldphone {
    private Integer phone;
    private String name;
    private Double price;

    Mobile(){
        System.out.println("DC");
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println(this.name+this.phone+this
                .price);
    }
    @Override
    void calling(){
        System.out.println("Touch dailpad");
    }

}
class oldphone implements Simcard{

    void calling(){
        System.out.println("Calling using dailpad");
    }

    @Override
    public void enter() {
        System.out.println("Entered");
    }
}

interface Simcard{
    void enter();
}
