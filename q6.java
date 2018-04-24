public class q6
{
public static void main(String args[])
{
int a,b,c=0;
a=Integer.parseInt(args[0]);
for(b=2;b<a;b++)
{
if(a%b==0)
{
c=1;
System.out.println(a+" is not a prime no....");
break;
}
}
if(c!=1)
System.out.println(a+" is  a prime no....");
}
}



