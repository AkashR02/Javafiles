import java.util.Scanner;
public class fibonacci
{
    public static void fib(int n)
    {
        int n1=0,n2=1,n3,count=0;
        while(count<n)
        {
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            count++;
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of fibonacci series: ");
            int n=sc.nextInt();
            fib(n);
        }
    }
}