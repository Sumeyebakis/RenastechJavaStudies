package Day4_Operators;

public class Topic2_LogicalOperations {
    public static void main(String[] args) {

        // AND ===> "&&" In order the operation to result true all the operations should be true
        // in AND operation; if one condition is false you don't have to check the other. Because result is false
        boolean checkLogic= true&&true;
        System.out.println("The Logic is:"+checkLogic );

        boolean logic= (78==90)&&(876!= 8987)&&(98>23);
        System.out.println(logic);


        //OR ==> "||" in order have a true operation It is enough to have only one true.
        boolean logic1= false||false||false||true;
        System.out.println("The result is: "+logic1);

        boolean logic2 = !(!(90==90)||(90!=80)||(76>90));
        System.out.println(logic2);

        boolean logic3 =((89==89)&&(45>=23)||((67<=90)&&(true)));
        System.out.println("The result is: "+logic3);




    }
}
