import java.util.Scanner;
class ForEachString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String array[]=new String[4];
		System.out.println("Enter 4 names");
		for(int i=0; i<array.length; i++){
			array[i]=sc.nextLine();
		}
		//System.out.print("Names are: ");
		for(String element : array){
		System.out.println(element);
		}
	}
}