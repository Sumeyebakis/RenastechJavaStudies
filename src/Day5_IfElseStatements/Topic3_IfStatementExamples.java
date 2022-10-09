package Day5_IfElseStatements;

public class Topic3_IfStatementExamples {
    public static void main(String[] args) {

        int a = 89;
        int b = 2783;
        int c = 476;

        if (a>b && a>c ){
            System.out.println("The highest number is: "+a);
        }
        if (b>c && b>a){
            System.out.println("The highest number is: "+b);
        }
        if (c>a && c>b){
            System.out.println("The highest number is: "+c);
        }

        int num1 = 96;
        int num2 = 35;

        int ans = num1-num2;

        if (ans>0){
            System.out.println("The answer is positive");
        }
        if(ans<0){
            System.out.println("The answer is negative");
        }
        if (ans==0){
            System.out.println("The answer is zero");
        }
    }
}
