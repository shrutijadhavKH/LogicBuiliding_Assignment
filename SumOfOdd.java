import java.util.Scanner;
class SumOfOdd{
	public static void main(String args[]){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		System.out.print("Sum of Odd numbers between 0 to "+num+ " is ");
		for(int i=0; i<=num; i++){
			if(i%2!=0){
				sum+=i;
				
				
			}
		}
		System.out.println(sum);
		
		
		
	}
}