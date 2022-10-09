package Day3_OperationsandStrings;

public class Topic1_Strings {
    public static void main(String[] args) {

        // Strings are not primitive data type
        // Datatype name = value  (value must be in double quote)
         String name = "sumo";
        System.out.println("my name is "+name);

        String aPara = "This is a paragraph";
        System.out.println(aPara);

        String spc = "6573256753,.,==$#@%";
        System.out.println(spc);

        String numbers = "837678"; // it is not a number, it is a text
        System.out.println(numbers);

        //combine two text
        String txt1 = "This is the text 1";
        String txt2 = "this is the text 2";
        String txt3 = txt1+txt2;
        System.out.println(txt3);

        String num1 = "53";
        String num2 = "79";
        String num3 = num1+num2;
        System.out.println(num3);

        int numa = 87;
        int nihal = 78;
        int birgul = numa+nihal;
        System.out.println(birgul);

        System.out.println("Hello World"+ " Hello World"+ " Hello World");


    }
}
