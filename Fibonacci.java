import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms of fibonacci series: ");
        int n = sc.nextInt();
        int a = 0 , b = 1 , c;
        System.out.println(a);
        System.out.println(b);
        for (int i=3 ; i<=n ; i++)
        {
            c = a + b;
            System.out.println(c);
        }
    }
}    
