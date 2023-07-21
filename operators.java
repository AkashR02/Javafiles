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