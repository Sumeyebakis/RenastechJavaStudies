package Day4_Operators;

public class Topic5_PrePostConditions {
    public static void main(String[] args) {
        int a = 45;
        int b = 46;
        System.out.println(a+b);

        //(++) increment
        int s = 14;
        System.out.println(s++);

        int n = 37;
        System.out.println(++n);

        int num= 56;
        System.out.println(num++);
        System.out.println(++num);

        int num1= 23;
        num1++; // after semicolon value changes
        System.out.println("The value is: " +num1);

        int num2= 82;
        System.out.println(++num2);
        System.out.println(num2++);

        // -- decrement
        int d = 45;
        System.out.println(d--);

        int e = 78;
        System.out.println(--e);


        int num3= 63;
        System.out.println(num3--);
        System.out.println(--num3);

    }
}
