import java.util.Scanner;
class SumOfNum{
	public static void main(String args[]){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int Num=sc.nextInt();
		
		for(int i=1; i<=Num; i++){
			sum=sum+i;	
			
		} 	
		System.out.println("The sum of numbers from 1 to " + Num + " is: " + sum);
	}
}