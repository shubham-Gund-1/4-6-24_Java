// 1!/1 + 2!/2 + 3!/3 + 4!/4+ + n!/n
import java.util.*;
public class Six{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        double sum = 0;
        double factorial = 1;
        System.out.println("Enter the value of n :");
        n=input.nextInt();
       for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial / i;
        }
        System.out.println("Sum of factorials from 1 to " + n + ": " + sum);
    }
}
