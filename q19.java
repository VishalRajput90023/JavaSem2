import java.util.Scanner;
public class q19
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
try
{
System.out.println("Enter the dividend= ");
int a=m.nextInt();
System.out.println("Enter the divisor= ");
int b=m.nextInt();
int c=a/b;
System.out.println("result= "+c);
try
{
System.out.println("Enter the value of x to find 1/x.....");
int x=m.nextInt();
int y=1/x;
System.out.println("result= "+y);
int z[]={1,2,3};
System.out.println("Enter the index of array to find element of array(int z[]={1,2,3} )  ") ;
int d=m.nextInt();
System.out.println("element=  "+z[d]);
}
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("length of array is only three");
}

}

catch (ArithmeticException e)
{
System.out.println("Divisor cannot be zero");
}
}
}




