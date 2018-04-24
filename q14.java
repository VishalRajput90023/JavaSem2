import java.util.Scanner;
public class q14
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
System.out.println("Enter any no." );
int a=m.nextInt();//boxing
Integer i=a;//unboxing
Integer x=new Integer(a);
System.out.println("BINARY REPERESENTATION OF "+a +"  is " );
System.out.println(x.toBinaryString(a));
}
}

