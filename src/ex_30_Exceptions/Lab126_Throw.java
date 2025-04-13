package ex_30_Exceptions;

public class Lab126_Throw {
    public static void main(String[] args) {

    }
    static void divByZero(int a){
        if(a==0){
            throw new ArithmeticException();
        }

    }
}
