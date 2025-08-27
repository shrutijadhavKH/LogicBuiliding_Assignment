import java.util.Scanner;
class ArrayForEach{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Element: ");
		int size=sc.nextInt();
		
		
		int array[]=new int[size];
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}
	     for(int element : array){
			 System.out.println(element);
		 }
			
		}
	}
