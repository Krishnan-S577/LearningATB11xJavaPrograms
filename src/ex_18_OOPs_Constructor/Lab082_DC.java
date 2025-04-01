package ex_18_OOPs_Constructor;

public class Lab082_DC {
    public static void main(String[] args) {
        Baby b = new Baby();
        b.cry();
    }
}
    class Baby{

    String name;

    void sleep(){
        System.out.println("Baby is sleeping");
    }

    void cry(){
        System.out.println("Baby is Crying");
    }

        Baby(){
            System.out.println("I am called, Default Constructor!");
            // Fetch data from the MySQL database...
            // Read from CSV File , XLSX
            // Open a file and read the data. (json, testdata.xlsx, txt file)


        }

    }
