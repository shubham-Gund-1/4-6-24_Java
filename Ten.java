// 1+4+9+16+---n;
import java.util.Scanner;
public class Ten{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to " + n + ": " + sum);
    }
}
