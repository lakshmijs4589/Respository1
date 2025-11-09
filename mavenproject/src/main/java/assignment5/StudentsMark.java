package assignment5;

public class StudentsMark {

	int marktotal1;
	int marktotal2;
	public StudentsMark(int m1,int m2, int m3 ,int m4 ,int m5, int m6)
	{
		 marktotal1 = m1 + m2 + m3;
		 marktotal2 = m4 + m5 + m6;
		
	}
	public String getGrade(int total) {
        if (total >= 120) {
            return "GradeA";
        } else if (total >= 105) {
            return "GradeB";
        } else if (total >= 60) {
            return "GradeC";
        } else {
            return "GradeD";
        }
				
	}
	public static void main(String[] args) {
		StudentsMark obj = new StudentsMark(45,46,47,36,37,38);
		
        System.out.println("Student 1 total: " + obj.marktotal1);
        System.out.println("Student 2 total: " + obj.marktotal2);

        System.out.println("Student 1 grade: " + obj.getGrade(obj.marktotal1));
        System.out.println("Student 2 grade: " + obj.getGrade(obj.marktotal2));
		
	}
}
