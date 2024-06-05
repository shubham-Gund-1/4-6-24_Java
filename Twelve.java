// 1 + 3 + 6 + 10 + + n
import java.util.Scanner;
public class Twelve{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0,tn = 0;
        for (int i = 1; i <= n; i++) {
            tn += i;
            sum += tn;
        }
        System.out.println("Sum of triangular numbers from 1 to " + n + ": " + sum);
    }
}
