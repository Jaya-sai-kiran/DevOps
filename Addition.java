//Write a Program in Java to Add two Numbers
import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a value:");
        a=sc.nextInt();
        System.out.print("Enter b value:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Addition of a and b is:"+c);
        sc.close();
    }
}
