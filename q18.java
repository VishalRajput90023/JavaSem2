import java.util.Scanner;
class q18
{
public static void main(String args[])
{
int a,b, c=0;
try
{
Scanner abc=new Scanner(System.in);
System.out.println("enter the divedend  ");
a=abc.nextInt();
System.out.println("enter the divsor  ");
b=abc.nextInt();
c=a/b;
System.out.println("result  "+c);
}
catch (ArithmeticException e)
{
System.out.println("Divisor cannot be zero.. ");
}
}
}