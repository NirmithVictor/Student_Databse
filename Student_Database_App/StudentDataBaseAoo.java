package Student_Database_App;
import java.util.*;
public class StudentDataBaseAoo {
	public static void main(String[] args) {
		//ask the user for how many students are to be added
		//create the number of fucks you wanna add into the sys so ye		
		//ask the user how many people he wants to add
		System.out.print("How many students would you like to enter into the database: ");
		Scanner n=new Scanner(System.in);
		int stu=n.nextInt();
		//create number of n students
		Student[] stud=new Student[stu];
		for(int i=0;i<stu;i++) {
			stud[i]=new Student();
			stud[i].enroll();
			stud[i].payTuition();
			//System.out.println(stud[i].toString());
		}
		System.out.println("\nThe database contains");
		for(int i=0;i<stud.length;i++) {
			System.out.println("---------------------------------");
			System.out.println(stud[i].toString());
			System.out.println("---------------------------------\n");
		}
	}
}
