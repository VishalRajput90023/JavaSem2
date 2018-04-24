 
class q13 
{
static void meth(int...a)
{
System.out.println("No. of arguments: "+a.length);
System.out.println("Arguments are: ");

for(int x:a)
System.out.print(x+" ");
System.out.println();
System.out.println();
}
public static void main(String args[])
{
meth(1,4,3);
meth(1,15,23,56,77);
meth();
meth(1,2);
}
}