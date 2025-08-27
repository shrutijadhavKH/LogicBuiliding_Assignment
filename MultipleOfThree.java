import java.util.Scanner;
class MultipleOfThree{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int Num=sc.nextInt();
		System.out.println("Multiple of 3 between 1 to  "+ Num + "is "+ Num);
	
		for(int i=1; i<=Num; i++){
			if(i%3==0){
				System.out.println(i + " ");
				
			}
			
		}
		
	}
}