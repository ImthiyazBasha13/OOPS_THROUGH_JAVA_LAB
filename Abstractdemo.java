import java.util.*;
abstract class Shapes
{
double a,b;
abstract void printarea();
}
class Rectangle extends Shapes{
void printarea(){
System.out.println("\t\tCalculating area of ractangle");
Scanner scr = new Scanner(System.in);
System.out.print("Enter the length:");
a =scr.nextDouble();
System.out.print("Enter the width:");
b =scr.nextDouble();
double area = a*b;
System.out.print("The area of rectangle is:"+area);
}
}
class Triangle extends Shapes{
void printarea(){
System.out.println("\t\tCalculating area of triangle");
Scanner scr = new Scanner(System.in);
System.out.print("Enter the base:");
a =scr.nextDouble();
System.out.print("Enter the height:");
b =scr.nextDouble();
double area = 0.5*a*b;
System.out.print("The area of triangle is:"+area);
}
}
class Circle extends Shapes{
void printarea(){
System.out.println("\t\tCalculating area of circle");
Scanner scr = new Scanner(System.in);
System.out.print("Enter the radius:");
a =scr.nextDouble();
double area = 3.14*a*a;
System.out.print("The area of circle is:"+area);
}
}
class Abstractdemo
{
public static void main(String args[]){
int choice;
Scanner scr = new Scanner(System.in);
System.out.println("\nchoose\n 1.Rectangle\t2.Triangle\t3.Circle");
choice = scr.nextInt();
switch(choice)
{
case 1:
Shapes obj1;
obj1=new Rectangle();
obj1.printarea();
break;
case 2:
Shapes obj2;
obj2=new Triangle();
obj2.printarea();
break;
case 3:
Shapes obj3;
obj3=new Circle();
obj3.printarea();
break;
}
}
}