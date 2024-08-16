//Armstrong number
import java.util.Scanner;
class P13{
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
        System.out.println("Enter a lower limit:");
        int lower=sc.nextInt();
        System.out.println("Enter a upper limit:");
        int upper=sc.nextInt();
        for (int no = lower; no <= upper; no++) {
            len = 0;  // Reset length for each number
            int length = order(no);  // Get the number of digits
            if (no == Armstrong(no, length)) {
                System.out.print(no+" ");
            }
        }
    }
}