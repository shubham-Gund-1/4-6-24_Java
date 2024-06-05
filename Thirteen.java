// 1.0 + 1.1 + 1.2 + 1.3 + ……… 
import java.util.*;
public class Thirteen{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sum =1.0,n;
        System.out.println("Enter the value of n :");
        n=input.nextInt();
        for (double i =1.0; i <=n; i++) {
            sum=sum+(1.0+i);
        }
        System.out.println("Sum of the series: " + sum);
    }
}
