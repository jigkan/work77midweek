import java.util.Scanner;

public class Sq7 {
    //7. Take input of age of 3 people by user and determine oldest and youngest among
    //them.
    public static void main(String []args){
       age();
    }
    public static void age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter age of 1 person:");
        int a = sc.nextInt();
        System.out.println("please enter age of 2 person:");
        int b = sc.nextInt();
        System.out.println("please enter age of 3 person:");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("person is youngest:" + a);
        } else {
            System.out.println("person is oldest:" + a);
        }

        if (b > a && b > c) {
            System.out.println("person is youngest:" + b);
        } else {
            System.out.println("person is oldest:" + b);
        }
        if (c > a && c > b) {
            System.out.println("person is youngest:" + c);
        } else {
            System.out.println("person is oldest:" + c);
        }


    }}





