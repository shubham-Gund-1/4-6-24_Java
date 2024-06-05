import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 int i,j,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=0;
            for(j=1;j<=(i/2);j++)
            {
                if(i%j==0)
                {
              sum=sum+j;
              
                }
            }
            if(i==1)
            System.out.println("Perfect no o upto n " + i);
            if(sum==i)
            {
                System.out.println("Perfect no o upto n " + i);
            }
     }

	}
}