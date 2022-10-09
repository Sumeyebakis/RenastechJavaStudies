package Day5_IfElseStatements;

public class Topic1_PrimitiveCasting {
    public static void main(String[] args) {

        // primitive casting is to change the primitive data type but when we do the casting from
        // lower level to upper level we will have issues
        // we put the type of data in front of it.

        byte by= 40;
        System.out.println("the byte value is: "+by);

        short s= by;
        System.out.println(s);

        int sum = by;
        System.out.println(sum);

        int inNum= 40;
        System.out.println("the int value is: "+inNum);

        int a = 24767575;

        short b = (short)a;
        System.out.println("The value b is: "+b);

        int c= 546;

        short d = (short)c;
        System.out.println(d);

        float e= d;
        System.out.println(d);

        int num1 = 6363;
        int num2 = 795;
        float num3 = num1/num2;
        float num4 = (float) num1/num2;
        System.out.println("The result is: "+num3);
        System.out.println("The result in float number is: "+num4);

    }
}
