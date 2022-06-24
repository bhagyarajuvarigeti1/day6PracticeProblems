import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N Value");
        int N = in.nextInt();
        int sum = 0;
        for(int i=1;i<N;i++){
            if(N%i == 0){
                sum += i;
            }
        }
        if(N == sum){
            System.out.println(N + "is a Armstrong number");
        }
        else System.out.println(N  + "is Not a Armstrong number");
    }
}
