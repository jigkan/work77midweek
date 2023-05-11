import java.util.Scanner;

public class Sq9 {
    //9. Modify the above question to allow student to sit if he/she has medical cause. Ask
    //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
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
        System.out.println("he/she has medical cause or not ( 'Y' or 'N' )=" );
        char yes = sc.next().charAt(0);
        char c='Y';
        if (c==yes ){System.out.println("student is allowed to sit in exam because ehe/she has medical cause" );}
        else if (results>=75){
            System.out.println("student is allowed to sit in exam" );
        }
        else {System.out.println("student isn't allowed to sit in exam" );}

    }
    }

