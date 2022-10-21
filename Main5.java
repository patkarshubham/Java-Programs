import java.util.*;
 class Main5 {
    public static int countDig(int n,int d) {
        if(n==0 && d==0) return 1;
        if(n<0) n= -n;
        int count=0;
        while(n !=0){
            int dig=n%10;
            if(dig==0)count++;
            n=n/10;
        }
        return count;
        }
    public static void main(String s[]) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int d=sc.nextInt();
            int x= countDig(n,d);
            System.out.println("dig"+d+"occur"+x+"times"+n);
}}