package ex_03_Literals;

public class Lab012_Char_Literals {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("KrishnanDazzy");
        System.out.println("Krishnan"+new_line+"Dazzy");
        System.out.println("Krishnan"+tab_line+"Dazzy");
        System.out.println("Krishnan"+back_space+"Dazzy");
        System.out.println("Krishnan is old"+carriage_return+"Dazzy");


        char Ruppes = '₹';
        System.out.println(Ruppes);

    }
}


