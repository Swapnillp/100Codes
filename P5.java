//Java Program to Find Greatest of three Numbers
import java.util.Scanner;
class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int no1=sc.nextInt();
        System.out.println("Enter num2:");
        int no2=sc.nextInt();
        System.out.println("Enter num3:");
        int no3=sc.nextInt();
            if(no1>no2 && no1>no3){
                System.out.println("no1 is gretter");
            }else if(no2>no3){
                System.out.println("no2 is gretter");
            }else{
                System.out.println("no3 is gretter");
            }

    }
}