// 1x+2x+..........nx
import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,x,i,sum=0;
        System.out.println("Enter x and n :");
        x=input.nextInt();
        n=input.nextInt();
        for(i=1;i<=n;i++){
            sum=sum+(i*x);
        }
        System.out.println(sum);
    }
}