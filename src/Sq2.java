public class Sq2 {
    //2. Print multiplication table of 24, 50 and 29 using loop.
    public static void main(String[]args){
       table24();
       table50();
       table29();
    }
    public static void table24(){
        System.out.println("Table of 24");
        for (int i=1;i<=10;i++){
            int b=i*24;
            System.out.println(" 24 X " + i +" = " + b);}

        }

    public static void table50(){
        System.out.println("Table of 50");
        for (int i=1; i<=10;i++){
            int b=i*50;
            System.out.println(" 50 X " + i +" = " + b);}

    }
    public static void table29(){
        System.out.println("Table of 29");
        for (int i=1; i<=10;i++){
            int b=i*29;
            System.out.println(" 29 X " + i +" = " + b);}
}}
