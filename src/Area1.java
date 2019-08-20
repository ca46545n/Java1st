import java.util.Scanner;


public class Area1 {
    int length;
    int breadth;

    public Area1(int len, int bre) {

        length = len;
        breadth = bre;
    }

    public int getArea() {
        return length * breadth;

    }


    public static void main(String[]args) {
        Scanner t = new Scanner(System.in);
        int len,bre;


        System.out.println("Enter the length of the rectangle: ");
        len = t.nextInt();

        System.out.println("Enter the length of the breadth: ");
        bre = t.nextInt();


        Area1 g = new Area1(len ,bre);

        System.out.println("The area is:  " +g.getArea());
    }
}
