import java.util.Scanner;

class DoWhile{
	
	static int askForPositiveNumber(){
		Scanner sc=new Scanner(System.in);
		int number;
		do{
			
			System.out.println("ENTER A POSITIVE NUMBER : ");
			number=sc.nextInt();
		}while(number<=0);{
			return number;
			
		}
		
	}
	public static void main(String[] args) {
        int positiveNumber = askForPositiveNumber();
        System.out.println("You entered a positive number: " + positiveNumber);
}
}