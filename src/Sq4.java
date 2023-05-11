import java.util.Scanner;

public class Sq4 {
    //4. Take values of length and breadth of a rectangle from user and check if it is square or not.
public static void main(String [] args){
    rectangle();
}
public static void rectangle(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter values of length = ");
    int length=sc.nextInt();
    System.out.println("Enter values of breadth = ");
    int breadth=sc.nextInt();
    if (length==breadth){
        System.out.println("it is square ");}
    else { System.out.println("it isn't square ");}

    }
}




