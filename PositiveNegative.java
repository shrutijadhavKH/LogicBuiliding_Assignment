import java.util.Scanner;
class PositiveNegative{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size=sc.nextInt();
		int positivecount=0;
		int negativecount=0;
		int array[]=new int[size];
		
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextInt();
			if(array[i]>=0){
				positivecount++;
			}else {
				negativecount++;
			}
		}
		
		System.out.println("Positive numbers: " + positivecount);
        System.out.println("Negative numbers: " + negativecount);

        sc.close();
	}
}