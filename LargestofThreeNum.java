import java.util.*;
class LargestofThreeNum{
public static void main(String[] args){
int x,y,z;
System.out.println("Enter a num");
Scanner sc=new Snanner(System.in);
x= sc.nextInt();
y= sc.nextInt();
z= sc.nextInt();
if(x>y && x>z)
System.out.println("First largest num");
else if(y>x && y>z)
System.out.println("Second largest num");
else if(z>x && z>y)
System.out.println("third largest num");
else
System.out.println("enter distnict number");
}}