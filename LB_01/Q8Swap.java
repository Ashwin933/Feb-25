//8. Swap Two Numbers 

class Swap{
	public static void main(String args[]){
		int a=74;
		int b=36;
		System.out.println("Before Swap");
		System.out.println(a);
		System.out.println(b);

		int temp=a;
		a=b;
		b=temp;

		System.out.println("After Swap");
		System.out.println(a);
		System.out.println(b);
	}
}