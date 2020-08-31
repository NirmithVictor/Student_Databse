package Student_Database_App;
import java.util.*;
public class Student {
	
	private String firstname,lastname,courses="",balance;
	private double tuitionBalance=0;
	private String name;
	private String studentID;
	private static ArrayList<String> ar = new ArrayList<String>();
	private int gradeyear;
	private static String[] nameArray=new String[ar.size()];
	private static int id=1001,compcount=4,histcount=5,statcount=3,mathcount=5; 
	private static int CostOfCourse = 600;
	//what is this? this is to make sure only one person gets one seat too lazy to use sort and shit so yea suck it motherfuckers
	private int compc=0,histc=0,statc=0,mathc=0;
	/*
	public void addarray(ArrayList<String> ar) {
		ar.toArray(nameArray);
		for(int i=0;i<nameArray.length;i++) {
			System.out.println(nameArray[i]);
		}
	}*/
	
	//constructor
	//^prompt the bastard I meant user to give some info such as name and year, if he don't he gay
	public Student() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("\n---------------------------------\nEnter the firstname of the student: ");
		this.firstname=in.next();
		
		System.out.print("Enter the lastname of the student: ");
		this.lastname=in.next();
		this.name=firstname+lastname;
		ar.add(name);
		
		//ar.toArray(nameArray);
		
		/*for(int i=0;i<nameArray.length;i++) {
			System.out.println(nameArray[i]);
		}*/
		//System.out.println(ar);
		//addarray(ar);
		System.out.print("\nPlease pick a year that the student is in \n1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\n");
		System.out.print("\nGrade year: ");
		this.gradeyear=in.nextInt();
		System.out.println("-------------------------\n");
		setstudentID();
		//System.out.println(firstname+" "+lastname+" - "+gradeyear+" - "+studentID);
		//System.out.print(generateID());		
	}
	//Generate a ID
	private void setstudentID() {
		//Grade level + ID tag
		id++;
		this.studentID=gradeyear+""+ id;
	}
	//enroll in courses
	/*histcount=5,statcount=3,mathcount=5*/
	private String a;
	public void enroll() {
		System.out.println("Course seating available are: \n1. COMP101 ("+compcount+")\n2. HIST101 ("+histcount+")\n3. STAT101 ("+statcount+")\n4. MATH101 ("+mathcount+")\n Press any number key to Quit\n");
		//get inside a loop,user hits 0 when the user is done enrolling
		do {
		System.out.print("Enter course option to enroll: ");
		
		Scanner in=new Scanner(System.in);
		//String course=in.nextLine();
		int option=in.nextInt();
		//so what we want to do is limit the person's option to that of list provided so what we are going to do is create a menu like option where people add what they want and when they do so 
		//if(!course.equals("Q" ))
		if(option==1||option==2||option==3||option==4){
			if(option==1 && compcount>0 && compc<1) {
				courses=courses+"\n"+"COMP101";
				tuitionBalance=tuitionBalance+CostOfCourse;
				compcount=compcount-1;
				compc=compc+1;
			}
			else if(option==2 && histcount>0 && histc<1) {
				courses=courses+"\n"+"Hist101";
				tuitionBalance=tuitionBalance+CostOfCourse;
				histcount=histcount-1;
				histc=histc+1;
			}
			else if(option==3 && statcount>0 && statc<1) {
				courses=courses+"\n"+"Stat101";
				tuitionBalance=tuitionBalance+CostOfCourse;
				statcount=statcount-1;
				statc=statc+1;
			}
			else if(option==4 && mathcount>0 && mathc<1) {
				courses=courses+"\n"+"Math101";
				tuitionBalance=tuitionBalance+CostOfCourse;
				mathcount=mathcount-1;
				mathc=mathc+1;
			}
			else if(mathc>=1||statc>=1||histc>=1||compc>=1) {
				System.out.println("---------------------\n//Dont't be a dick only one seat per person\\\\\n---------------------");
			}
			else {
				System.out.println("\n-----------------------------------\nThe Course is full mate sorry!!!\n-----------------------------------");
			}
			//System.out.print("");				
		}else {
			break;
			}
		}while(1!=0);
	}
	//view balance
	public void viewBalance() {
		System.out.println("---------------------\nYour total balance atm is: $"+tuitionBalance+"\n---------------------");
	}
	//pay tuition
	public void payTuition() {
		viewBalance();
		Scanner a=new Scanner(System.in);
		System.out.print("Enter fees that you would want to pay: ");
		double payment=a.nextDouble();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("---------------------\nThank you for your payment of $"+payment+"\n---------------------");
		//viewBalance();
	}
	//show status
	public String toString() {
	
		return "Name: "+firstname+" "+lastname+"\n"+"Student ID number: "+studentID+"\n"+"Grade year: "+gradeyear
				+"\n"+"Courses registered: "+courses+"\n Money You Owe: "+tuitionBalance;
	}
}