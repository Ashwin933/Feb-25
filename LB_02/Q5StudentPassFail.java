//Question 5: Student Pass/Fail Status with Nested Switch 


import java.util.Scanner;
class StudentPassFail{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter marks for Subject 1: ");
        	int subject1 = sc.nextInt();

        	System.out.print("Enter marks for Subject 2: ");
        	int subject2 = sc.nextInt();

        	System.out.print("Enter marks for Subject 3: ");
        	int subject3 = sc.nextInt();

		int failedSubjects=0;

		if(subject1<40) failedSubjects++;
		if(subject2<40) failedSubjects++;
		if(subject3<40) failedSubjects++;
		

		switch(failedSubjects){
			case 0:
				System.out.println("Congratulations! You passed all subjects.");
				break;
			default:
				System.out.println("you failed in "+failedSubjects+" subjects.Better luck next time!");
			break;
		}


	}
}