/*1. Create a program that declares and initializes all primitive data types 
in Java and prints their default and assigned values.*/

class DataTypes{
		
		//instance variables(default values)
		byte defaultByte;
		short defaultShort;
		int defaultInt;
		long defaultLong;
		float defaultFloat;
		double defaultDouble;
		char defaultChar;
		boolean defaultBoolean;
		
	public static void main(String args[]){
	
	//Local variables must be initialized before use
		byte assignedByte=10;
		short assignedShort=34;
		int assignedInt=87;
		long assignedLong=7287652L;
		float assignedFloat=59.90F;
		double assignedDouble=20.98;
		char assignedChar='A';
		boolean assignedBoolean=true;
		
		System.out.println("byte: " + assignedByte);
        System.out.println("short: " + assignedShort);
        System.out.println("int: " + assignedInt);
        System.out.println("long: " + assignedLong);
        System.out.println("float: " + assignedFloat);
        System.out.println("double: " + assignedDouble);
        System.out.println("char: " + assignedChar);
        System.out.println("boolean: " + assignedBoolean);
		
		DataTypes obj=new DataTypes();
		
		System.out.println(obj.defaultByte);
		System.out.println(obj.defaultShort);
		System.out.println(obj.defaultInt);
		System.out.println(obj.defaultLong);
		System.out.println(obj.defaultFloat);
		System.out.println(obj.defaultDouble);
		System.out.println(obj.defaultChar);
		System.out.println(obj.defaultBoolean);
		
	}
}
