import java.util.Scanner;

public class Sq1 {
    //1. Take 10 integers from keyboard using loop and print their average value on the
    //screen.
    public static void main (String []args){
 loop();
    }
    public static void loop(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number =sc.nextInt();
        int sum =0;
        for (int i=0; i<10; i++){

            System.out.println("Enter number: ");
             sum =sum+sc.nextInt();
            System.out.println("Enter number sum is: " + sum);}

        int average=sum/10;
        System.out.println("Enter number average is: " + average);
    }

}
