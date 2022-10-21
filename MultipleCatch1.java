public class MultipleCatch1 {
public static void main(String args[]) {
try {
int x = 0;
//int arr[] = new int[10];
for (int i = 0; i <= 10; i++) {
//arr[i] = i / x;
int n = i / x;
}
}catch (ArrayIndexOutOfBoundsException exception) {
System.out.println("1st block = ArrayIndexOutOfBoundsException");
}catch (ArithmeticException exception) {
System.out.println("2nd block = ArithmeticException");
}catch (Exception exception) {
System.out.println("3rd block = Exception");
}
}}