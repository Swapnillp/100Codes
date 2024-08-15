//Find the Sum of the Digits of a Number in Java.
import java.util.Scanner;
class P9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int no=sc.nextInt();
        int sum=0;
        while(no!=0){
            sum+=no%10;
            no=no/10;
        }
        System.out.println(sum);
    }
}