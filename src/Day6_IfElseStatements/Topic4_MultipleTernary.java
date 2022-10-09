package Day6_IfElseStatements;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {

        /*
        (condition)? first:(condition2)?:second:(condition3)?third:forth;
         */
        //write a code where it checks if number is even or odd or zero
        // (a%2==0)? "The number is even":(a%2!=0)? "The number is odd": "The number is zero"

        int number1 = 81;
        String result = (number1%2==0)? "The result is Even":(number1%2!=0)?"The number is odd": "The number is zero";
        System.out.println(result);
    }
}
