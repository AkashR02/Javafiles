public class testarray2 {
    public static void min(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Minumum element is "+min);
    }
    public static void max(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Maximum element is "+max);
    }
    public static void main(String[] args)
    {
        int a[]={5,1,6,7,2};
        min(a);
        max(a);
    }
}
