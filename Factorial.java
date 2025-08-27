import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		int factorial=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++){
		 factorial*=i;
		}
		System.out.println("Factorial of "+ num + " is " + factorial);
	}
}