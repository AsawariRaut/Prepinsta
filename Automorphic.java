import java.util.Scanner;
class Automorphic
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number");
int n = sc.nextInt();
int sq= n*n;
int l=0;
int t=n;
while(t>0)
{
t=t/10;
l++;
}
int lastno=sq%(int)Math.pow(10,l);

if(n==lastno)
{
 System.out.println("Automorphic number");
}
else
 System.out.println("Not Automorphic number");
}
}
