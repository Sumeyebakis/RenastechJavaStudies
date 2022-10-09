package Day5_IfElseStatements;

public class Topic4_IfElseStatement {
    public static void main(String[] args) {

        /*
        if (condition){
            code block
        }else {
            another code block
        }
         */


        int a = 456;
        int b = 234;

        if (a>b){
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        System.out.println("This is from outside the if else statements");


        // EXAMPLES

        /*
        Check if a student will be accepted to school;
        1) SAT score must be 90 or more
        2) writing skill 5 or more
         */


        double stScore = 89;
        int wrScore = 7;

        if (stScore>=90 && wrScore>=5){
            System.out.println("Student is accepted");
        }else{
            System.out.println("Student is rejected");
        }

        // Check if the water is boiling

        double bPoint = 100;
        double temp = 100;

        if (temp==bPoint){
            System.out.println("Water is boiling");
        }else{
            System.out.println("Water is not boiling");
        }
    }
}
