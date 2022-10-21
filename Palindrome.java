import java.util.*;
class Palindrome
{  
 public static void main(String args[])
 {  
  int r,sum=0,t;    
  int num;
 Scanner sc = new Scanner(System.in);  
 System.out.println("Enter any number ");  
 num = sc.nextInt(); 
 t=num;    
 while(num>0)
 {    
   r=num%10;  
   sum=(sum*10)+r; 
   num=num/10;    
  }    
  if(t==sum)    
   System.out.println("Given Number Is Palindrome Number "+ t);    
   else    
   System.out.println("Given Number Is Not Palindrome Number" + t);    
}  
}  