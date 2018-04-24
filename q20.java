import java.util.Scanner;
class myexcptn extends Exception
{
 /* private int b;
  myexcptn(int a)
 {
   b=a;
 }*/
     public String toString()
 {
    return " this is my exception";
   }
}
class myexception1
{
static void abc(int a) throws myexcptn
{
System.out.println("abc funtion is executed when a= "+a);
if(a>6)
throw new myexcptn ();
System.out.println("Runs without any exception");
}
}
class q20 extends myexception1
{
public static void main(String args[])
{
try
{
System.out.println("enter the value less than 6 to run the programme without any exception...");
Scanner m=new Scanner(System.in);
int x=m.nextInt();
abc(x);
System.out.println("enter the value greater than 6 to run the programme with my exception...");
int y=m.nextInt();
abc(y);
}
catch (myexcptn e)
{
System.out.println("caught ="+e);
}
}
}