import java.util.Scanner;
public class Perfect{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Perfect numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            int sum = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j * j != i) {
                        sum += i / j;
                    }
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
