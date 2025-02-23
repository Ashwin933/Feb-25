
//Question 2: Days of the Week  


import java.util.Scanner;
class DaysOfWeek{


	public static void switchDayType(Boolean isWeeday){
		switch(isWeeday ? 1:0){
			case 1:
				System.out.println("It's a Weekend");
				break;
			case 0:
				System.out.println("It's a Weekend");
				break;
		}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number (1-7) for the day of the week: ");
        	int day = sc.nextInt();

		switch(day){
			case 1: 
				System.out.println("Monday");
				switchDayType(true);
				break;
			case 2: 
				System.out.println("Tueday");
				switchDayType(true);
				break;
			case 3: 
				System.out.println("Wednesday");
				switchDayType(true);
				break;
			case 4: 
				System.out.println("Thurday");
				switchDayType(true);
				break;
			case 5: 
				System.out.println("Friday");
				switchDayType(true);
				break;
			case 6: 
				System.out.println("Saturday");
				switchDayType(false);
				break;
			case 7: 
				System.out.println("Sunday");
				switchDayType(false);
				break;
			default:
                	System.out.println("Invalid input! Please enter a number between 1 and 7.");
			}

	}
}