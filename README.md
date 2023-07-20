# largestSum

public class largestnum{
    public static void main(String args[] ){
        int a=13, b=34,c= 90,max;
        max = (a>b) ? (a>c?a:c):(b>c?b:c);
        System.out.println("maximum number is : "+max);
    }
}

# multiplicationTable

public class multiplicationtable {
    public static void main(String args[]){
        // int n = 10;
        int i = 1;
        while (i<11){
            System.out.println("7"+" x "+ i + " = " + i*7);
            i++;
        }
    }
    
}

# pattern 1
public class pattern2 {
    public static void main(String args[]){
    int size = 5;
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            System.out.print("*");
        }
        System.out.println();
    }
} 
}

day 2 some pgms
public class operators {
    public static void main(String[] args) {
        int a=12,b=12,c=14,d=14,result1,result2,result3,result4;
        System.out.println("Value of a: "+a);
        result1=++a;
        System.out.println("After increment: "+result1);
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        result2=--b;
        System.out.println("After decrement: "+result2);
        System.out.println("Value of b: "+b);
        System.out.println("Value of c: "+c);
        result3=c++;
        System.out.println("After increment: "+result3);
        System.out.println("Value of c: "+c);
        System.out.println("Value of d: "+d);
        result4=d--;
        System.out.println("After decrement: "+result4);
        System.out.println("Value of d: "+d);
    }
}

public class operators {
    public static void main(String[] args) {
        int size=5;
        for(int i=1;i<=size;i++){
        for(int j=1;j<=size;j++)
        System.out.print("*");
    System.out.println();
}
}
}

public class operators {
    public static void main(String[] args) {
        int size=5;
        for(int i=1;i<=size;i++){
        for(int j=1;j<=size;j++){
            if(i==1||i==size)
        System.out.print("*");
        else{
            if(j==1||j==size)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        }
    System.out.println();
}
}
}


public class operators
{
    public static void main(String[] args)
    {
        int size=5;
        for(int i=size;i>=1;i--)
        {
            for(int j=1;j<=size;j++)
            {
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

day 3 pgms
public class palindrome
{
    public static void main(String[] args)
    {
        int n=7666;
        int r,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println(temp+" is Palindrome");
        else
        System.out.println(temp+" is not Palindrome");
    }
}

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

public class foreach {
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40};
        for(int i:arr)
        System.out.println(i);
    }
}


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

public class testreturnarray {
    static int[] get()
    {
        return new int[]{10,20,30,40,50};
    }
    public static void main(String args[])
    {
        int arr[]=get();
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };
        System.out.println("The matrix is: ");
        for(int[] row : matrix){
            for(int column : row){
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
