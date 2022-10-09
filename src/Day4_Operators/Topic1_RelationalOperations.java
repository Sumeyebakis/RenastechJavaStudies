package Day4_Operators;

public class Topic1_RelationalOperations {
    public static void main(String[] args) {

        // "==" Check if two things are equal
        boolean check = 2 == 8;
        System.out.println("The answer is: "+check);

        int a = 90;
        int b = 110;
        boolean check1 = a == b;
        System.out.println(check1);
        boolean check2 = 20==20;
        System.out.println(check2);


        //"<" check if one thing is less than the other
        boolean check3= 60<110;
        System.out.println("Is 60 less than 110: "+check3);


        // ">" check if one thing is greater than the other
        boolean check4 = 90>1987;
        System.out.println(check4);


        // "<=" check is one thing is less than or equal the other
        boolean check5= 100<=500;
        System.out.println(check5);
        boolean check6 = 900<=900;
        System.out.println("result is: "+check6);


        // ">=" check if one thing is greater than or equal the other
        boolean check7 = 986>=673;
        System.out.println("The result is: "+check7);


        // "!=" not equal
        boolean check8= 90!=90;
        System.out.println(check8);


        // "!" convert the opposite value
        boolean check9 = !(234!=2728);
        System.out.println(check9);

        boolean check10 = !(!(10!=25));
        System.out.println(check10);

        boolean check11 = !(!(90==23)==!(98>98));
        System.out.println(check11);
    }
}
