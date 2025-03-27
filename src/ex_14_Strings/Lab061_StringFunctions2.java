package ex_14_Strings;

public class Lab061_StringFunctions2 {
    public static void main(String[] args) {
        String name = "Krishnan";
        System.out.println(name.length());
        System.out.println(name.charAt(3));

        System.out.println(name.concat(" Dazzy"));

        System.out.println(name.contains("sh"));

        System.out.println(name.equals("Krishnan"));

        System.out.println(name.indexOf("h"));

        String name2 = "Krishnan@live.com@123";
        String[] split = name2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(name.substring(0,4));


        String s111 = "Hello";
        String s222 = "World";
        String s333 = "ji";

        String result1 = s111 + s333 + s222;
        System.out.println(result1);
    }
}
