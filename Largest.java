class Largest{
	public static void main(String args[]){
		int num1=3;
		int num2=6;
		int num3=9;
		if(num1>num2 && num1>num3){
			System.out.println("num1 is greater");
		}
		else if(num3>num1 && num3>num2){
			System.out.println("num3 is greater");
		}
		else{
			System.out.println("num2 is greater");
		}
	}
}
