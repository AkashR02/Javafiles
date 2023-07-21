public class largestnum{
    public static void main(String args[] ){
        int a=13, b=34,c= 90,max;
        max = (a>b) ? (a>c?a:c):(b>c?b:c);
        System.out.println("maximum number is : "+max);
    }
}