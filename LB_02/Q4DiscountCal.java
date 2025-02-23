//Question 4: Discount Calculation


import java.util.Scanner;
class DiscountCal{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total purchase Amount (Rs.):- ");
		double totalPurchase=sc.nextDouble();
		System.out.println("Do you have a membership card? (yes/no):- ");
		String membership=sc.next().toLowerCase();

		double discountPercentage;
		
		if(totalPurchase>=1000){
			discountPercentage=20;
		}else if(totalPurchase>=500){
			discountPercentage=10;
		}else{
			discountPercentage=5;
		}

		if(membership.equals("yes")){
			discountPercentage+=5;
		}

		double discountAmount=(discountPercentage/100)*totalPurchase;
		double finalAmount=totalPurchase-discountAmount;

		
		System.out.println("Discount Applied:- "+discountPercentage+ "%");
		System.out.println("Discount amount:- "+discountAmount);
		System.out.println("Final Amount to pay: Rs. "+finalAmount);

	}
}