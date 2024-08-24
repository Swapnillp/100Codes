//print a to z
class P40{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        char ch;
        for( ch=97;ch<123;ch++){
            sb.append(ch);
        }
        System.out.print(sb);
    }
}