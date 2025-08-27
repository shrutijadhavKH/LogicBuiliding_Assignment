import java.util.Scanner;
class MaxArray{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of elements: ");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for(int i=1; i<array.length; i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		System.out.println("The largest element is: " + max);
	}
	
}