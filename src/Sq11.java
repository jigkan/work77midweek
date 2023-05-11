import java.util.Scanner;

public class Sq11 {
    //11. Write a program to print a string entered by user.
    public static  void main(String []args ){
     str();
    }
    public static void str(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter String you want to print: ");
        String a =sc.nextLine();
        System.out.println("user entered is = " + a);


    }
}
