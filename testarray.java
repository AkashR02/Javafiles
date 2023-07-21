public class testarray
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        System.out.println("a: ");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        int b[]={2,4,6,8,10};
        System.out.println("b: ");
        for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
    }
}