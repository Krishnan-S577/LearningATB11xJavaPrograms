package ex_30_Exceptions;

public class Lab128_CustomExceptions {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",122);
        Bank icici = new Bank("INR",100);
        Bank jp_chase = new Bank("USD",101);
       // int total = sbi.add(icici);
        int total = sbi.add(jp_chase);
        System.out.println(total);
    }
}
