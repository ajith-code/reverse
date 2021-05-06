import java.io.*;
import java.util.Scanner;
class reverse
{
public static void main(String[] args)
{
int count=0,d;
Scanner a=new Scanner(System.in);
System.out.println("enter the number");
int b=a.nextInt();
for(int i=0;i<=b;i++)
{

int c=b%10;
d=b/10;
b=d;
System.out.println(c);
if(b<10)
{
System.out.println(b);
}
}
}
}