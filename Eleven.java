// 1 + 8 + 27 + 64 + + n
import java.util.Scanner;
public class Eleven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }
        System.out.println("Sum of cubes from 1 to " + n + ": " + sum);
    }
}
