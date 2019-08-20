public class student {

    String name;
    int roll_no;
    String phone_number;
    String address;



    public static void main(String[] args) {
        student T = new student();

        T.name = "John";
        T.roll_no = 2;
        T.phone_number = "666-444-3322";
        T.address = "2343 Franklin st";

        System.out.println("Name of student"+" "+T.name +" " +"  their roll number is"+" "+T.roll_no+" " + "Student number is:" +" "+T.phone_number);



        student P = new student();
        P.name = "Sam";
        P.roll_no = 3;
        P.phone_number = "555-999-8877";
        P.address = " 72 bleeker st";


        System.out.println(T.roll_no+ " " +  T.phone_number+" "+  T.address);
        System.out.println(P.roll_no+ " " +  P.phone_number+" "+  P.address);


    }

}
