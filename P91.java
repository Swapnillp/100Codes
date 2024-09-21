//pattern
/*
    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */
class P91{
    public static void main(String args[]){
        int n=5;
        //outter loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}