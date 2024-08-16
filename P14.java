//Find the Fibonacci Series up to Nth Term in Java Language
class P14{
    static void fib(int no){
        int a=0,b=1;
        System.out.print(a+" "+b);
        //int c;
        for(int i=0;i<=no-2;i++){
        int c=a+b;
        a=b;
        b=c;
        System.out.print(" "+c);
        }
    }
    public static void main(String args[]){
        int no=10;
        P14.fib(no);
    }
}