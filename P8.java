import java.util.Scanner;

class P8 {
    public static boolean checkPrime(int no) {
        if (no < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range:");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        int count=0;
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Total number of prime is:"+count);
    }
}
