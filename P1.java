//Check if a Number is Positive or Negative in Java
import java.util.Scanner;
class P1{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int no=sc.nextInt();
        if(no>0){
            System.out.println("Number is positive");
        }else if(no<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");

        }
    }

}