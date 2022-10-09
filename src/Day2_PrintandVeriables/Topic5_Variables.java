package Day2_PrintandVeriables;

public class Topic5_Variables {
    public static void main(String[] args) {

        // variables are the conteiners where they hold the values for us

        /*
        Primitive Date types
        1- boolean: holds two values, true or false
        2- byte: holds the whole number in range of -128 to 127
        3- char: holds the characters for instance c, or R, or ", or }
        4- short: holds whole number in range of -32768 to 32767
        5- int : holds whole number
        6- long : holds the whole number
        7- float: holds decimal numbers up to 7 decimal digit
        8- double : holds decimal numbers up to 16 decimal digit
         */

        // type name = value;  (boolean: true/false)
        boolean theName=true;
        System.out.println(theName);

        boolean defValue = false;
        System.out.println(defValue);


        //type name= value (byte: -128 to 127)
        byte aNumber = 10;
        System.out.println(aNumber);


        //type name= value (char: for char values we use '' single quotes)
        char aChar = 'h';
        System.out.println(aChar);


        // type name= value (short: -32768 to 32767)
        short aShort= -10000;
        System.out.println(aShort);


        //type name= value (int: holds whole number)
        int anInt = 900000;
        System.out.println(anInt);

        //type name= value (longs: holds all numbers, huge number. Put 'L' after number.)
        long aLong = 1627626765657L;
        System.out.println(aLong);

        //type name = value ( float: decimal numbers, put 'f' after number)
        float aFloat = 483.6776f;
        System.out.println(aFloat);

        // type name = value (double: decimal numbers as well, you don"t have to put 'd')
        double dNumber = 900.36367;
        System.out.println(dNumber);

        // declaring multiple variables on the same line
        int number1= 26, number2=768, number3=63738;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double dNumber1, dNumber2, dNumber3;
        dNumber1=28.638; dNumber2=78.7383; dNumber3=356.73839;
        System.out.println(dNumber1);
        System.out.println(dNumber2);
        System.out.println(dNumber3);
    }
}
