package ex_20_OOPs_Polymorphism.MethodOverRiding;

public class Lab091_MOverRiding2 {
    public static void main(String[] args) {
        Chrome c1 = new Chrome();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new Chrome();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Open the IE Browser");
    }
}

class Chrome extends  CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Open CHROME");
    }
}

class Firefox extends  CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Open Firefox");
    }
}
