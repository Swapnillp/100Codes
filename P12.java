//Armstrong number
import java.util.Scanner;
class P12{
    static int len=0;
    static int order(int no){
        while(no!=0){
            len++;
            no=no/10;
        }
        return len;
    }
    static int Armstrong(int no,int len){
        int sum=0,temp,digit;
        temp=no;
        while(temp!=0){
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,len);
            temp=temp/10;
        }
        return sum;
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int no=sc.nextInt();
        P12.order(no);
        if(Armstrong(no,len)==no){
            System.out.println("Armstrong number :");
        }else{
            System.out.println("not Armstrong number :");

        }

    }
}