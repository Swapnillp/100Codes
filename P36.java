//check the string are palindrome or not
//racecar---racecar
import java.util.Scanner;
class P36{
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.next();
        if(palindrome(str)){
            System.out.println("String is palindrome :");
        }else{
            System.out.println("String is not palindrome :");

        }
       
    }
}