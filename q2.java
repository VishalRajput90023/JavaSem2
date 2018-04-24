//Factorial of a number using command line arguments

public class q2
{
public static void main(String args[])
{
int a,i=1;
a=Integer.parseInt(args[0]);
for(;a>=1;a--)
{i=a*i;
}
System.out.println("Factorial of the enterd number: "+args[0]+" = "+ i);
}
}