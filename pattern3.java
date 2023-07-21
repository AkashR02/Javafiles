public class pattern3
{
    public static void main(String[] args)
    {
        int size=5,c;
        for(int i=size;i>=1;i--)
        {c=1;
            for(int j=1;j<=size;j++)
            {
                if(j<i)
                System.out.print(" ");
                else{
                System.out.print(c+" ");
                c=c+1;
                }
            }
            System.out.println();
        }
    }
}