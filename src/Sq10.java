import java.util.Scanner;

public class Sq10 {
    //10. Write a program to print the sum of two numbers entered by user by defining your
    //own method.
    public static void main(String[]args){
sum();
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number = ");
        int a = sc.nextInt();
        System.out.println("please enter second number = ");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("sum of entered two numbers is =" + c );


    }
}
