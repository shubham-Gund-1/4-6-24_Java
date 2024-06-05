// 1x+3x+5x..........nx
import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,x,i,sum=0;
        System.out.println("Enter x and n :");
        x=input.nextInt();
        n=input.nextInt();
        for(i=1;i<=n*2;i=i+2){
            sum=sum+(i*x);
        }
        System.out.println(sum);
    }
}