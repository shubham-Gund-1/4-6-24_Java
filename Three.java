// 1!+2!+3!+4!........n!
import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum = 0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *=j;
            }
            sum += fact;
            System.out.println("Factorial of "+(i)+" is :"+fact);
        }
        System.out.println("Sum of factorials is :" + sum);
    }
}

