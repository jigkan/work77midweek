import java.util.Scanner;

public class Sq5 {
    //5. Take two int values from user and print greatest among them.
    public static void main(String []args){
        value();

           }
           public static void value(){
               Scanner sc=new Scanner(System.in);
               System.out.println("please enter one number :");
               int number1 = sc.nextInt();
               System.out.println("please enter second number :");
               int number2 = sc.nextInt();
               if (number1 > number2) {
                   System.out.println("greatest among them is :" + number1);
               } else if (number2> number1) {
                   System.out.println("greatest among them is :" + number2);
               }


           }


}
