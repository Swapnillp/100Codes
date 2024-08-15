//Java Program to Find Greatest of Two Numbers
import java.util.Scanner;
class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int no1=sc.nextInt();
        System.out.println("Enter num2:");
        int no2=sc.nextInt();
            if(no1<no2){
                System.out.println("no2 is gretter");
            }else if(no1>no2){
                System.out.println("no1 is gretter");
            }else{
                System.out.println("no is equal");
            }

    }
}