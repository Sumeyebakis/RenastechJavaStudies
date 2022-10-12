package Day8_Scanners;

import java.util.Scanner;

public class Topic1_Scanner {
    public static void main(String[] args) {

        //next() ==> it will read a word from the console
        // Java class
        // nextline () ==> it reads the whole line on console
        // Java class

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String firstName = scan.next();
        System.out.println("Your first name is: "+firstName);
        String age = scan.next();
        System.out.println("Your age is: "+age);
        System.out.println("Please enter your zipcode");
        String zipcode = scan.next();
        String zipcodeage = age+zipcode;
        System.out.println("The age + Zipcode: "+zipcodeage);

    }
}
