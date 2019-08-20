
import java.util.Scanner;

public class AddDistance {

    private   int feet;

    private int inches;


    public void AddDistance() {

        Scanner fi = new Scanner(System.in);

        System.out.print("Enter how many feet: ");
        feet = fi.nextInt();
        System.out.print("Enter how many inches: ");
        inches = fi.nextInt();



    }
    public void ShowDistance() {

        System.out.println("Feet: " + feet + "\tInches: " + inches);
    }
    public void AddDistance(AddDistance D1,AddDistance  D2)
    {
        inches=D1.inches+D2.inches;
        feet=D1.feet+D2.feet+(inches/12);
        inches=inches%12;
    }


    Class AddDistance;


    public static void main(String []args){


        AddDistance D1 = new AddDistance();
        AddDistance D2 = new AddDistance();
        AddDistance D3 = new AddDistance();



        System.out.println("Enter first distance: ");
        D1.AddDistance();


        System.out.println("Enter second distance: ");
        D2.AddDistance();


        D3.AddDistance(D1,D2);

        System.out.println("Total distance is:" );
        D3.ShowDistance();




    }



}