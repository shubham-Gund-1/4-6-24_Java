// 1+3+5+9+---n;
import java.util.*;
public class Nine{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=n*2;i=i+2){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}