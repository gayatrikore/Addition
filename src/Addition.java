import java.util.Scanner;

public class Addition {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a=Integer.parseInt(sc.next().toString());
        int b=Integer.parseInt(sc.next().toString());
        int result=a+b;
        System.out.println("Addition is"+result);
    }

}
