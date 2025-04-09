package ex_28_Enum;

public class Lab108_Enum {
    public static void main(String[] args) {

        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println(" -- ");
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());


        System.out.println(" -- ");
        System.out.println(Urls.google.getUrl());
        System.out.println(Urls.vwo.getUrl());
        System.out.println(Urls.katalon.getUrl());


    }

}
