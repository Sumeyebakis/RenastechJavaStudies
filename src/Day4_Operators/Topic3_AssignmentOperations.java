package Day4_Operators;

public class Topic3_AssignmentOperations {

    public static void main(String[] args) {
        int a= 80;
        System.out.println("The value is: "+a);

        a=90; // a is now 90. You don't have to put int one more time, if you write it gives an error.
        System.out.println("The value is: "+a);

        a= a+40; // a value is now 130
        System.out.println(a);

        a= a+40; // a now 170. it based on the last value before the line.
        System.out.println(a);

        a= 59908989;
        System.out.println(a);

        a+= 100000; // a= a+ 100 and a+=100 same things
        System.out.println(a);

        int b = 100;

        b = b-30;
        System.out.println(b);

        b-=10;  // b=b-30   b-=30
        System.out.println("The result is: "+b);

        int theanswer = b-a;
        System.out.println("The answer is: "+theanswer);



    }
}
