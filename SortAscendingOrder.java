import java.util.Scanner;
import java.util.Arrays;
class SortAscendingOrder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an Array: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Array in ascending order:");
		for(int elements : array ){
			System.out.print(elements + " ");
			
		}
	}
	

}