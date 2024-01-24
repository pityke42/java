package org.example.inheritance.pojoAndRecord;

public class Main {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("s92300" +i,
                    switch (i){
                case 1 -> "mari";
                case 2 -> "lali";
                case 3 -> "joli";
                case 4 -> "feri";
                case 5 -> "zoli";
                default -> "Anonymus";
                    },
                    "01-01-1998",
                    "java masterclass");
            System.out.println(s);
        }


        Student pojostudent = new Student("1293719287",
                "ann",
                "01-29-1992",
                "gatya");
        LPAStudent recordStudent = new LPAStudent("123123",
                "bill",
                "99978-127126-81",
                "gtja");
        System.out.println(pojostudent);
        System.out.println(recordStudent);

        pojostudent.setClassList(pojostudent.getClassList() + ", java ocp");
//        recordStudent.classList(recordStudent.classList() + ", java ocp"); immutable

        System.out.println(pojostudent.getName());
        System.out.println(recordStudent.name());

    }
}
