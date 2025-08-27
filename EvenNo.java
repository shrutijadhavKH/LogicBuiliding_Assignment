import java.util.Scanner;
class EvenNo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		
		System.out.print("Even numbers are: ");
		
		for(int i=0; i<=num; i++){
			if(i%2==0){
				System.out.print(i+ " ");
				
			}
		
		}
		
	}
	
}