//check prime number
import java.util.Scanner;
class P7{
    public static boolean checkPrime(int no){
        if(no<2){
            return true;
        }
        if(no==2){
            return false;
        }
        for(int i=2;i<no/2;i++){
            if(no%i==0){
               return true;
            }
        }
        return false;
   
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int no=sc.nextInt();
        P7.checkPrime(no);
        if(checkPrime(no)==true){
            System.out.println("no is not prime");
        }else{
            System.out.println("no is prime");
        }

    }
}