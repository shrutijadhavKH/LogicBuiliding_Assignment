import java.util.Scanner;
class AverageArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an Array: ");
		int size=sc.nextInt();
		
		float array[]=new float[size];
		System.out.print("Elements of an arrays are: "  );
		float sum=0;
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextFloat();
		 sum+=array[i];	
		}
		
		float average=sum/array.length;
		System.out.println("Average of the given array elements is: "+average);
	}
}