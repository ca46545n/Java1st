public class Triangle {

    int side1, side2, side3;

    public static void main (String[]args){

        Triangle i = new Triangle();
        i.side1 = 3;
        i.side2 = 4;
        i.side3 = 5;
        {
            int s = (i.side1+i.side2+i.side3) / 2;
            double area = Math.sqrt(s * (s -i.side1) * (s -   i.side2) * (s -i.side3));
            System.out.println("Area of Triangle is: " + area);


        }



        System.out.println(" The perimeter of Triangle is: " + (i.side1 + i.side2 + i.side3));







    }
}
