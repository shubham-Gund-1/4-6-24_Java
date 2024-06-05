import java.util.*;
class Prime{
    public static void main(String[] args) {
        int i=2,j,n,flag=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a numbers :");
        n=input.nextInt();
        for(i=2;i<=n;i++)
        {
            flag=0;
            for(j=2;j<=(i/2);j++)
            {
             if (i%j==0){
               flag=1;
               break;
             }
    
        }   
        if  (flag==0)
            System.out.println(" "+i);
        }
    }
}