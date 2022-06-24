import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value");
        int N = in.nextInt();
        int rev = 0;
        while (N != 0){
            int temp = N%10;
            N /= 10;
            rev = (rev*10)+temp;
        }
        System.out.println(rev);
    }
}
