//Find the Sum of First N Natural Numbers in Java
import java.util.Scanner;
class P3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int no=sc.nextInt();
        int sum=0;
        for(int i=0;i<=no;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}