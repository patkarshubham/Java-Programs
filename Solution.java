public class Solution {
public static void main (String args[])
{
 Small small = new Small();
 small.a= 1 ;
 small.print();
}
}

class Big
{
private int a;
void print ()
{
 System.out.println(a);
}
}

class Small extends Big
{int a;
void print ()
{
 super .print();
}
}