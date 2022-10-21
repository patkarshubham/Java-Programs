import java.util.*;
class SwapnumWithouttemp{
public static void main(String[] args){
int x,y;
System.out.println("Enter x and y values :");
Scanner sc= new Scanner(System.in);
x= sc.nextInt();
y= sc.nextInt();
System.out.println("Before swaping x ="+x+" and y ="+y);
x=x+y;//7+5=12
y=x-y; //12-7=5
x=x-y; //12-5=7

System.out.println("After swaping x ="+x+" and y ="+y); 
}}