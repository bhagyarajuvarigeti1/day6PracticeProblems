import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value");
        int N = in.nextInt();
        int sum = 0;
        System.out.print(0);
        for(int i=1;i<N;i++){
            sum += i;
            System.out.print(" , "+sum);
        }
    }
}
