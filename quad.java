import java.util.*;
class quad{
public static void main(String args[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of a,b,c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=(b*b)-4*a*c;
if(d==0){
System.out.print("Roots are real and equal");
}
else if(d>0)
{
System.out.print("Roots are real and unequal");
}
else {
System.out.print("Roots don't exist");
}
float r1 =(float)(-b+Math.sqrt(d))/(2*a);
float r2 =(float)(-b-Math.sqrt(d))/(2*a);
System.out.print("Roots are:"+r1+","+r2);
}
}
