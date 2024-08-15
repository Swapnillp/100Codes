//number is palindrome or not
import java.util.Scanner;
class P11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int no=sc.nextInt();
        int num=no;
        int rem;
        int sum=0;
          while(num!=0){
           rem=num%10;
           sum=sum*10+rem;
           num=num/10; 
          }
         if(no==sum){
            System.out.println("Enter number is palindrome");
         }else{
            System.out.println("Enter number is not palindrome");
         }
    }
}