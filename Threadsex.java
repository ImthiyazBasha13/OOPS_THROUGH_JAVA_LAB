class Gm extends Thread{
public void run(){
for(int i=1; i<6;i++){
System.out.println("Good Morning");
try{Thread.sleep(1000);}catch(Exception e){}
}
}
}
class Hello extends Thread{
public void run(){
for(int i=1; i<6;i++){
System.out.println("Hello");
try{Thread.sleep(2000);}catch(Exception e){}
}
}
}
class Welcome extends Thread{
public void run(){
for(int i=1; i<6;i++){
System.out.println("Welcome");
try{Thread.sleep(3000);}catch(Exception e){}
}
}
}
public class Threadsex
{
public static void main(String args[])
{
Gm ob1 = new Gm();
Hello ob2 = new Hello();
Welcome ob3 = new Welcome();
ob1.start();
try{Thread.sleep(10);}catch(Exception e){}
ob2.start();
try{Thread.sleep(10);}catch(Exception e){}
ob3.start();
}
}
