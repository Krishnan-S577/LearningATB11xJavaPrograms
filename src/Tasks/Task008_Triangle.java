package Tasks;

public class Task008_Triangle {
    public static void main(String[] args) {
        /*
         Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal),
         or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.
        */
        int s1 = Integer.parseInt(args[0]);
        int s2 = Integer.parseInt(args[1]);
        int s3 = Integer.parseInt(args[2]);

        if (s1==s2 && s2==s3){
            System.out.println("equilateral");
        } else if (s1==s2 || s2==s3 || s1==s3) {
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
