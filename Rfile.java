import java.util.*;
import java.io.*;
class Rfile{
public static void main(String args[])throws IOException{
int i,j=1;
Scanner scr = new Scanner(System.in);
System.out.println("Enter the file name:");
String str = scr.next();
FileInputStream f = new FileInputStream(str);
int n = f.available();
System.out.print(j+": ");
char ch;
for(i=1;i<n;i++){
ch = (char)f.read();
System.out.print(ch);
if(ch=='\n')
{
System.out.print(++j+": ");
}
}
}
}
