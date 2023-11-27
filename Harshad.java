import java.util.Scanner;
class Harshad
{
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
n=sc.nextInt();
int num=n;
int sum=0;

while(n!=0)
{
 int a= n%10;
sum+=a;
n/=10;
}
if(num%sum==0)
{
System.out.println("The given number is Harshad Number");
}
else
System.out.println("The given number is not Harshad Number");

}
}

