import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N Value");
        int N = in.nextInt();
        if(isPrime(N)){
            System.out.println(N + " is a prime number");
        }
        else
            System.out.println(N + " is not a prime number");
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
