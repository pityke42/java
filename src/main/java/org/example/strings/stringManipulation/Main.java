package org.example.strings.stringManipulation;

public class Main {
    public static void main(String[] args){
        String birthdate = "26/06/1998";
        int startingIndex = birthdate.indexOf("1998");
        System.out.println("startingIndex: " + startingIndex);
        System.out.println("birthyear: " + birthdate.substring(startingIndex));

        System.out.println("Month: " + birthdate.substring(3,5));
        String newdate = String.join("/", "25", "11", "1902");
        System.out.println("new date: " + newdate);

        newdate = " 25";
        newdate = newdate.concat("/");
        newdate = newdate.concat("11");
        newdate = newdate.concat("/");
        newdate = newdate.concat("1902");
        System.out.println("newdate: " + newdate);

        System.out.println(newdate.replace('/','-'));
        System.out.println(newdate.replace("2","00"));

        System.out.println(newdate.replaceFirst("/","-"));
        System.out.println(newdate.replaceAll("/","---"));

        System.out.println("abc\n".repeat(3));
        System.out.println("abc\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("   abc\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));


    }
}
