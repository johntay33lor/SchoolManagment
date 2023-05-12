package school_management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher rick = new Teacher(1, "Rick", 500);
        Teacher james = new Teacher(2, "James", 700);
        Teacher bobby = new Teacher(3, "Bobby", 600);

        Student brown = new Student(1, "Brown", 4);
        Student jimmy = new Student(2, "Jimmy", 12);
        Student john = new Student(3, "John", 5);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(rick);
        teacherList.add(james);
        teacherList.add(bobby);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(brown);
        studentList.add(jimmy);
        studentList.add(john);

        School ghs = new School(teacherList,studentList);

        Teacher phil = new Teacher(6, "Phil", 900);
        ghs.addTeacher(phil);

        brown.payFees(5000);
        jimmy.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("---Making the SCHOOL pay the Salary---");
        rick.receiveSalary(rick.getSalary());
        System.out.println("RSHS has spent $" + ghs.getTotalMoneySpent() + " to pay " + rick.getName() +
                " and they now have $" + ghs.getTotalMoneyEarned());
        bobby.receiveSalary(bobby.getSalary());
        System.out.println("RSHS has spent $" + ghs.getTotalMoneySpent() + " to pay " + brown.getName() +
                " and they now have $" + ghs.getTotalMoneyEarned());
        System.out.println(jimmy);
        james.receiveSalary(james.getSalary());
        System.out.println(james);
    }
}