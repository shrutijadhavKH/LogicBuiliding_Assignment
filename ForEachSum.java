import java.util.Scanner;
class ForEachSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size for an Array: ");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		for(int i =0; i<array.length; i++){
			array[i]=sc.nextInt();
			//System.out.print(i);
		    
		}
	    int sum=0;
		for(int element : array){
			sum+=element;
		}
		System.out.print(" Sum of the array is : " +sum);
	}
	
}