import java.util.Scanner;
class GetInput{
public static void main(String[] args){
int i;
float f;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String : ");
s= sc.nextLine();
System.out.println("Entered string : "+s);
System.out.println("Enter Ineger : ");
i= sc.nextInt();
System.out.println("Entered Ineger : "+i);

System.out.println("Enter Float Value : ");
f= sc.nextFloat();
System.out.println("Entered Float value : "+f);


}}