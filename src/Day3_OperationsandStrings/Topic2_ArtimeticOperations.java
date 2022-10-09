package Day3_OperationsandStrings;

public class Topic2_ArtimeticOperations {
    public static void main(String[] args) {

        // (+) Addition
        int num1 = 37;
        int num2 = 637;
        int num3 = num1+num2;
        System.out.println(num3);
        System.out.println("the result is: "+num3);
        System.out.println(num1+num2);
        System.out.println("we have to use (), if we want to add one number to the other. " +
                "when we did not put numbers in () it will write side by side.\n" +
                "example: "+num1+num2);
        System.out.println("\nThis is the result: "+(num1+num2));

        int num4 = 737;
        float num5 = 497.747f;
        float num6 = num4+num5;
        System.out.println("The result is: "+num6);

        double num7 = 25.646;
        int num8 = 900;
        double num9 = num7+num8;
        System.out.println("The result is: " +num9);

        // (-) subtraction
        int num10 = 100;
        int num11 = 688;
        int result = num10-num11;
        System.out.println("The result is: "+result);


        // (*) Multiplication
        int num12 = 60;
        int num13 = 20;
        int result2 = num12*num13;
        System.out.println("the result is: " +result2);

        double num14 = 723.3636;
        double num15 = 63;
        double result3 = num14*num15;
        System.out.println( "The result is: "+result3);
        System.out.println(num15);


        // (/) division
        int num16= 626;
        int num17 = 70;
        int result4 = num16/num17;
        double result5 = num16/num17;
        double result6 = (double)num16/num17;
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);


        double num18 = 26.3737;
        double num19 = 27.39388;
        double result7 = num18/num19;
        System.out.println(result7);

        //(%) module (mod) get the remainder of the division

        int num20 = 98;
        int num21 = 3;
        int num22 = num20%num21;
        System.out.println("The result of mod: "+num22);

        double num23 = 90.45;
        double num24 = 8.56;
        double modResult = num23%num24;
        System.out.println("The mod result for double is: "+modResult);


    }
}
