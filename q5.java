//Conversion from decimal to binary

public class q5
{
public static void main(String args[])
{
int a;
int index=0;
a=Integer.parseInt(args[0]);
System.out.println("BINARY REPERESENTATION OF "+a +"  is " );
int x[]=new int[30];
while(a>0)
{
x[index++]=a%2;
a=a/2;
}
for(int i=index-1;i>=0;i--)
System.out.print(x[i] );
}
}
