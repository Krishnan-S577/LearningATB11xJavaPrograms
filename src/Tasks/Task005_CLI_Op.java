package Tasks;

public class Task005_CLI_Op {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        int a = Integer.parseInt(args[0]);
        System.out.println("Enter First Number :" + a);
        int b = Integer.parseInt(args[1]);
        System.out.println("Enter Second Number :" + b);

        String Max = (a>b) ? "a is Greater" : "b is Greater" ;
        System.out.println(Max);
    }
}
