//Factorial of number.
import java.util.Scanner;
class P15{
    static int fact=1;
    public static void fact(int no){
        for(int i=1;i<=no;i++){
            fact*=i;
        }
        System.out.println("factorial of number is:"+fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int no=sc.nextInt();
         P15.fact(no);
    }
}