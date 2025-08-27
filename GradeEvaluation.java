class GradeEvaluation{
	public static void main(String args[]){
		int grade;
		int maths_marks=80;
		int science_marks=85;
		int history_marks=90;
		int average=(maths_marks+science_marks+history_marks)/3;
		System.out.println("Average:" + average);
		
		if(average>=90){
			System.out.println("Grade: A");
		}else if(average<89 && average>70){
			System.out.println("Grade: B");
		}else if(average>50 && average<69){
			System.out.println("Grade: C");
		}else if(average>30 && average<49){
			System.out.println("Grade: D");
		}else if(average<30){
			System.out.println("FAIL");
		}
	}
}