import java.util.Scanner;

class SumWithMethod{
	
	static int sumOfTwoNumbers(int a, int b){
		return a+b;
	} 
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter 1st number:");
		int num1=sc.nextInt();
		
		
		System.out.print("Enter 2nd number:");
		int num2=sc.nextInt();
		
		
		int result = sumOfTwoNumbers(num1,num2);
		System.out.println("Sum of two numbers is: "+result);
		
		
	}
}