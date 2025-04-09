package ex_28_ENUM;

public class Lab210_ENUM {

    public static void main(String[] args) {

        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println(" -- ");
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());


        System.out.println(" -- ");
        System.out.println(LAB211_APIURLs.google.getUrl());
        System.out.println(LAB211_APIURLs.vwo.getUrl());
        System.out.println(LAB211_APIURLs.katalon.getUrl());


    }

}
