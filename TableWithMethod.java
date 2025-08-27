import java.util.Scanner;
class TableWithMethod{
	
	static void TableWithMethod(int a){
		
	for(int i =1; i<=10; i++){
		System.out.println(i + " * " + a + " = " + a*i);
	}
		
}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number=sc.nextInt();
		
		TableWithMethod(number);
		
	}
}