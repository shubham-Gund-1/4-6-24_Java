// xto the power1 + x to the power 2
import java.util.*;
public class Four{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x,n,f1=1,sum=0,i,j;
        System.out.println("Enter x and n :");
        x=input.nextInt();
        n=input.nextInt();
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                f1=f1*x;
            }
            sum=sum+f1;
        }
        System.out.println(sum);
    }
}