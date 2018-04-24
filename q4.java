//Two dimensional array

public class q4

{
public static void main(String args[])
{
int a,b,i,j,k=0;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
int twodi[][]=new int[a][b];


for(i=0;i<a;i++)
for(j=0;j<b;j++)
{twodi[i][j]=k;
k++;
}

for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
System.out.print(twodi[i][j]+"   ");
System.out.println();
}
}
}
