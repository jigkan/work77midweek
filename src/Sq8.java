import java.util.Scanner;

public class Sq8 {
    //8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    //Take following input from user
    //Number of classes held
    //Number of classes attended.
    //And print
    //percentage of class attended
    //Is student is allowed to sit in exam or not.
    public static void main(String[]args){
        allowed();
    }
    public static void allowed(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of classes held =" );
        int a = sc.nextInt();
        System.out.println("Number of classes attended  =" );
        int b = sc.nextInt();
        int results = b*100/a;
        System.out.println(" percentage of class attended="  + results+"%");
         if (results>=75){
             System.out.println("student is allowed to sit in exam" );
         }
         else {System.out.println("student isn't allowed to sit in exam" );}

    }
}
