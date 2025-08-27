import java.util.Scanner;
class SumWithForLoop{
	
	static int calculateSum(int N) {
		int sum=0;
		for(int i=1; i<=N; i++){
			System.out.println(i);
			 sum+=i;
		}
		return sum;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number");
		int num=sc.nextInt();
		int result=calculateSum(num);
		System.out.println("The sum of numbers from " + 1 + " to " + num +" is " + result);
	}
}