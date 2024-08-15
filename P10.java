//reverse the number
import java.util.Scanner;
class P10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int no=sc.nextInt();
        int rem;
        int sum=0;
          while(no!=0){
           rem=no%10;
           sum=sum*10+rem;
           no=no/10; 
          }
          System.out.println("reverse is :"+sum);
    }
}