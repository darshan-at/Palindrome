import java.util.Scanner;
class Palindrome{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n,temp;
		System.out.println("Program to check  whether number is Palindrome or not");
		System.out.print("Enter the number");
		n=scan.nextInt();
		int i,s=0;
		temp=n;
		while(temp!=0){
			i=temp%10;
			s=s*10+i;
			temp=temp/10;
		}
		if(s==n)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}