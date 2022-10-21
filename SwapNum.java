import java.util.*;
class SwapNum{
public static void main(String[] args){
int x,y,temp;
System.out.println("Enter x and y Values :");
Scanner sc = new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();

System.out.println("Befare swaping x = "+x+" and y = "+y);
temp=x;
x=y;
y=temp;
System.out.println("After Swaping : ");
System.out.println("x = "+x+" and y = "+y);
}}