import java.lang.*;
import java.io.*;
class diamondNumberStarPatternSandwichInvert
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j;
System.out.print("Enter N value:");
n=Integer.parseInt(br.readLine());
for(i=n;i>=1;i--)
{
for(j=1;j<i;j++)
{
System.out.print(i+"*");
}
System.out.println(i);
}
for(i=1;i<=n;i++)
{
for(j=1;j<i;j++)
{
System.out.print(i+"*");
}
System.out.println(i);
}
}
}