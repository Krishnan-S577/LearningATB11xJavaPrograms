package ex_19_OOPs_Inheritance.Single_Inheritance;

public class Testcase2 extends CommonToAll {

    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }

}
