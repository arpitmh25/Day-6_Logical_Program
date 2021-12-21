import java.util.Scanner;
class PrimeNumber {
	public static void main(String[] args) {
	int n,count=0;
	System.out.print("Enter any Number");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(int i=0; i<=n; i++)
	{
		if(n%i==0)
		{
         count++;
		}
	}
		if(count==2)
		System.out.println("Prime Number");
		else
		System.out.println("Is Not Prime Number");
	}
}