import java.util.Scanner;
class AgeCheckarWithMethod{
	static String checkAgeCategory(int age){
	if(age<18){
		return "child"	;		
	}else if(age>=18 && age<=40){
		return "Adult";
	}else if(age>40){
	return "Senior Citizen";
	}
	 return "";
}

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		String result = checkAgeCategory(age);
		
		System.out.println(result);
	}
}