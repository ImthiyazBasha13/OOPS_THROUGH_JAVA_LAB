import java.util.*;
class primenumbers
{
public static void main(String arg[])
{
int i,j,count;
System.out.print("Enter the value of n:");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
System.out.println("The primes numbers between 1 to"+n+"are:"); 
for(i=2;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
System.out.print(i+" "); 
}
}
}
