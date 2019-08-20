import java.util.Scanner;


public class Employee {
    String name;

    int year_of_joining;

    String address;


    public static void main(String[] args) {

        Employee a = new Employee();


        a.name = "Robert";
        a.year_of_joining = 1994;
        a.address = "64C- WallsStreat";


        Employee t = new Employee();


        t.name = "Sam";
        t.year_of_joining = 2000;
        t.address = " 68D- WallsStreat";


        Employee c = new Employee();


        c.name = "John";
        c.year_of_joining = 1999;
        c.address = "26B- WallsStreat";


        System.out.printf("%s %s  %s \n", "Name", "Address", "Year Joined");
        System.out.println(a.name + " " + a.address + " " + a.year_of_joining);
        System.out.printf("%s %s  %d \n", t.name, t.address, t.year_of_joining);
        System.out.printf("%s %s  %d", c.name, c.address, c.year_of_joining);


    }
}