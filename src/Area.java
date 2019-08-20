import java.util.Scanner;

public class Area {

    public static void main(String args[]){

        Scanner input= new Scanner(System.in);


        System.out.println("Enter the length of the rectangle: ");
        double getarea = input.nextDouble();

        System.out.println("Enter the length of the breadth: ");
        double setDim = input.nextDouble();


        double  area= getarea * setDim;

        System.out.println("The Area of the Rectangle based on your input:  " +area);

    }

}