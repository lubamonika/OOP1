package com.infoshare;

/**
 * Hello world!
 *
 */
public class App {
    String name ="";



    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println(hello("Monika"));
        System.out.println(helloReverse("Monika"));

    }

    public static String hello(String name) {
        return "Witaj " + name;
    }

    public static String helloReverse(String name) {
        StringBuilder sB = new StringBuilder("Witaj ");
        int size = name.length();
        char[] nameChar = name.toCharArray();
        for (int i=size-1; i>=0; i--) {
            sB.append(nameChar[i]);
        }
        String reversedName = sB.toString();
        return reversedName;
    }


}


