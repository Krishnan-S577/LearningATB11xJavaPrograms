package Tasks;

public class Task002_GradeCalculator {
    public static void main(String[] args) {
       /*
         A: 90-100
        B: 80-89
        C: 70-79
         D: 60-69
        F: 0-59
        */
        int Marks = 25;

        String Grade = Marks<100 & Marks>90 ? "A Grade" : (Marks<89 & Marks>80 ? "B Grade" : (Marks<79 & Marks>70 ? "C Grade" :
                (Marks<69 & Marks>60 ? "D Grade" :(Marks<59 & Marks>33 ? "F Grade" : "Fail"))));
        System.out.println(Grade);
    }
}
