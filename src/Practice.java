

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;





public class Practice {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(num);

        int i = 0;
        while(i <= 9) {

            i ++;

            System.out.println(num + "x" + i + "=" + (num*i));

            scanner.close();

        }

    }







}
