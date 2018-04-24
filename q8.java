public class q8
{
public static void main(String args[])
{
for(int i=0;i<5;i++)
{
switch(i)
{
case 0:
System.out.println();
System.out.println("To demonstrate setLength() and setCharAt() :");
StringBuffer ab=new StringBuffer("hello");
System.out.println("buffer before= " +ab);
ab.setCharAt(1,'i');
ab.setLength(2);
System.out.println("buffer after= " +ab);
break;

case 1:
System.out.println();
System.out.println("To demonstrate Append() :");
StringBuffer abd=new StringBuffer("hello ");
System.out.println("buffer before= " +abd);
StringBuffer abc=new StringBuffer("hi");
StringBuffer s=new StringBuffer();
s=s.append(abd).append(abc);
System.out.println("buffer after= " +s);
break;

case 2:
System.out.println();
System.out.println("To demonstrate insert()  :");
StringBuffer abe=new StringBuffer("how you?");
System.out.println("buffer before= " +abe);
abe.insert(4, "are ");

System.out.println("buffer after= " +abe);
break;

case 3:
System.out.println();
System.out.println("To demonstrate concat()  :");
String s1="hello";
String s2=" hows u?";
String s3=s1.concat(s2);
System.out.println(s3);
break;

case 4:
System.out.println();
System.out.println("To demonstrate equals()  :");
String s4="hello";
String s5="hello";

System.out.println(s4+" equals "+s5 +"---> " +s4.equals(s5));
break;


default:
System.out.println("end");
break;
}}}}

