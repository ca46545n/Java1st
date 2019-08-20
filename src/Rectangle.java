
public class Rectangle {
    int length;
    int breadth;


    public Rectangle(int len, int bre) {

        length = len;
        breadth = bre;

    }

    public int Area() {
        return length + breadth;

    }

    public int perimeter() {
        return 2 * (length + breadth);


    }

    public static void main(String[] args) {
        Rectangle C = new Rectangle(4, 5);
        Rectangle D = new Rectangle(5, 8);

        System.out.println("The Area of the First Rectangle is: " + C.Area());
        System.out.println("The Perimeter of the First Rectangle is: " + C.perimeter());

        System.out.println("The Area of the Second Rectangle is: " + D.Area());
        System.out.println("The Perimeter of the Second Rectangle is: " + D.perimeter());


    }
}
