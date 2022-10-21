final class Finally {
public static void main(String args[]) {
try {
final int var = 5;
//var=3;
/ error: cannot assign a value to final variable var
}catch (Exception exception) {
System.out.println("Exception occurred");
}finally {
System.out.println("Execution of finally block");
}
}}