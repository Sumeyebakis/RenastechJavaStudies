package Day6_IfElseStatements;

public class Topic6_NestIfElseStatementCont {
    public static void main(String[] args) {

        /*
        Last names = doe, yilmaz, Ekinci
        if last name is Yilmaz and the age is over 20 print the lastname and the age if not print just the name
        if last name is Doe and the age is over 10 print the just lastname  if not print just the age
         if last name is Ekinci print lastname and age.
         */

        String lastname = "Doe";
        int age = 56;

        if (lastname== "Yilmaz") {
            if (age > 20) {
                System.out.println("The lastname is: " + lastname + " \n the age is: " + age);
            } else {
                System.out.println("Just Lastname: " + lastname);
            }
        } else if (lastname == "Doe") {
            if (age > 10) {
                System.out.println("Just The Lastname: " + lastname);
            } else {
                System.out.println("Just age: " + age);

            }
        }else{
            System.out.println("Lastname: " +lastname+ "\n age: "+age);
    }
    }
}
