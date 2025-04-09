package ex_21_OOPs_Encapsulation;

public class Lab092_Encapsulation {
    public static void main(String[] args) {

        VWOLogin login = new VWOLogin("admin", "pwd");
        System.out.println(login.password);
        login.password = "Bokels Maam";
        System.out.println(login.password);

        VWOLogin2 login2 = new VWOLogin2("admin", "pwd");
        login2.setUsername("Dazzy");
        login2.getUsername();
        System.out.println(login2.getUsername());
        login2.setPassword("KriSh", true);
        System.out.println(login2.getPassword());
    }
}

class VWOLogin {
    public String username;
    public String password;

    VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}

class VWOLogin2{
    private String username; // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public VWOLogin2(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed to change the password!");
        }
    }
}
