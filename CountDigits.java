import java.util.*;
class CountDigits{
public static int countDigits(int n){
if(n==0){
return 1;}
if(n<0)
n= -n;
int res=0;
while(n!=0)
n=n/10;
res++;
return res;
}}
public static void main(Strings args[]){
Scanner sc= new Scanner(System.in);
int n =sc.nextInt();
System.out.println("the num of digits"+n+"are : "+ countDigits(n));
}
}