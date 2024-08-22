//String 
//String are java in immutable
import java.util.Scanner;
class P35{
    public static void main(String args[]){
        //declaraion
        String str=new String("nil");
        //dec 2
        String str1="swapnil";
        System.out.println(str);
        System.out.println(str1);
        //by input
        Scanner sc=new Scanner(System.in);
        String str2=sc.nextLine();
        System.out.println(str2);
        //length fun
        System.out.println(str1.length());
        //concatanation
        System.out.println(str +" "+str1);
        //charAt
        for(int i=0;i<str1.length();i++){
        System.out.print(str1.charAt(i)+" ");

        }

    }
}