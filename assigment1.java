package string;
import java .util.Scanner;
 class Assigment1 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println( " enter the string ");
    String  S=sc.nextLine();
    System.out.println(" the value index");
    int num=sc.nextInt();
    System.out.println(S.charAt(num));
    }
 }