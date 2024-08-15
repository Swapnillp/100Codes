// Leap year program in Java
import java.util.Scanner;
class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :");
        int year=sc.nextInt();
        if(year % 400==0){
            System.out.println("Year is Leap");
        }else if(year % 4 ==0 && year % 100!=0){
            System.out.println("Year is Leap");
        }else{
            System.out.println("Year is not Leap");

        }
    }
}