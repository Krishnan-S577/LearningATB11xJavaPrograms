package ex_30_Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class Lab125_Throws {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("abc/e/c");
        String s1 = null;
        s1.trim();
        int a = 10/0;
        File file = new File("ssa");
    }
}
