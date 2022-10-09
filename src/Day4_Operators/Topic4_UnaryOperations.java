package Day4_Operators;

public class Topic4_UnaryOperations {
    public static void main(String[] args) {
        // if you put + on the value it does not have any effect on the value. you have to put after value

        int a= +900; // a = +a
        System.out.println(a);

        int anum = -900;
        anum=+anum;
        System.out.println(anum);

        //(-) converts opposite sign

        int b= -938;
        b=-b;
        System.out.println(b);

        //(++) increase by 1
        int c= 94;
        c++;
        System.out.println(c);
        ++c;
        System.out.println(c);

        //(--) decrease by 1
        int d= 79;
        d--;
        System.out.println(d);
        --d;
        System.out.println(d);


        System.out.println(d++);
        System.out.println(++d);

        int sum = 56;
        System.out.println(--sum);

        int sum2 = 90;
        System.out.println(sum2++);
        System.out.println(++sum2);


    }
}
