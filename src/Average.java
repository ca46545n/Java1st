
import java.util.Scanner;

public class Average {


    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int a = t.nextInt();
        System.out.println("you entered number:" + a);

        System.out.println("Enter a number: ");
        int b = t.nextInt();
        System.out.println("you entered number:" + b);

        System.out.println("Enter a number: ");
        int c = t.nextInt();
        System.out.println("you entered number:" + c);

        System.out.println(" The average of these 3 numbers : " +average(a,b,c) );


    }

    public static double average(double a, double b, double c){

        return (a+b+c) /3;
    }




}

