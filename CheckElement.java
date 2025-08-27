import java.util.Scanner;
import java.util.Arrays;
class CheckElement{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an Array: ");
		int size=sc.nextInt();
		
		Integer array[]=new Integer[size];
		
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
		}	
		System.out.print("Enter the number to search: ");
        int num = sc.nextInt();
		
		if (Arrays.asList(array).contains(num)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
		
	}
}