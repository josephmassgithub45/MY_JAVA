

public class MyClass {

/*
	public static void main(String[] args) {
		//JAVA DATA TYPES
		
		String name="john";
		int num=15;
		float num2=12.5f;
		char value='M';
		boolean value2=true;
		
		System.out.println(name);
		System.out.println(num);
		System.out.println(num2);
		System.out.println(value);
		System.out.println(value2);
	}
*/
	
//11111111111111111111111111111111111111111111111111111111111111

/*
	public static void main(String[] args) {
		//JAVA FINAL VARIABLES
		
		final int num1=10;
		num1=20; //will generate error because values of final variables cannot be changed
		System.out.println(num1);
	}
*/
	
//111111111111111111111111111111111111111111111111111111111111111
	
/*	
	public static void main(String[] args) {
		//DECLARING MULTIPLE VARIABLES OF THE SAME TYPE
		
		int num1=10;
		int num2=20;
		int num3=30;
		System.out.println(num1+num2+num3);
		
		//OR
		
		int num11=10,num22=20,num33=30;
		System.out.println(num1+num2+num3);
		
		//DECLARING ONE VALUE TO MULTIPLE VARIABLES
		
		int number1,number2,number3;
		number1=number2=number3=40;
		System.out.println(number1+number2+number3);
	}
*/
	
//11111111111111111111111111111111111111111111111111111111111111111
	
/*
	public static void main(String[] args) {
		//JAVA NUMBERS
		
		byte myNum1 = 100;
		System.out.println(myNum1);
		
		short myNum2 = 5000;
		System.out.println(myNum2);
		
		int myNum3 = 100000;
		System.out.println(myNum3);
		
		long myNum4 = 15000000000L;
		System.out.println(myNum4);
		
		float myNum5 = 5.75f;
		System.out.println(myNum5);
		
		double myNum6 = 19.99d;
		System.out.println(myNum6);
		
		float f1 = 35e3f;
		double d1 = 12E4d;
		
		//JAVA BOOLEANS
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty); //Output false
		System.out.println(f1);
		System.out.println(d1);
		
		//JAVA CHARACTERS
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;  // Char is used to store single character this is with ASCII values.
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		
		char myVar11 = 'E', myVar22 = 'F', myVar33= 'G';  // Char is used to store single character this is with ALPHABET values.
		System.out.println(myVar11);
		System.out.println(myVar22);
		System.out.println(myVar33);
		
		String greeting = "Hello World";  // String is used to store sequence of characters
		System.out.println(greeting);
	}
*/
	
//111111111111111111111111111111111111111111111111111111111111111
	
/*
	public static void main(String[] args) {
		//TYPE CASTING
		
		
		//WIDENING CASTING ---when passing small datatype to a larger datatype
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);      // Outputs 9
		System.out.println(myDouble);   // Outputs 9.0
		
	    
		//NARROWING CASTING---when changing the datatype manually
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; // Manual casting: double to int

		System.out.println(myDouble2);   // Outputs 9.78
		System.out.println(myInt2);      // Outputs 9
	}
*/
	
//1111111111111111111111111111111111111111111111111111111111111
	
/*
	public static void main(String[] args) {
		//JAVA STRINGS
		
		//LENGTH FUNCTIONS
		String name="monday";
		System.out.println(name.length());
		
		String fname="monday";
		System.out.println(fname.toUpperCase());
		
		String lname="MONDAY";
		System.out.println(lname.toLowerCase());
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		//CONCATENATION
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		//OR
		
		String firstName1 = "John";
		String lastName1= "Doe";
		System.out.println(firstName1 .concat(" ").concat(lastName1));	
	}
*/
	
//111111111111111111111111111111111111111111111111111111111111111
	
/*

	public static void main(String[] args) {
		
		String txt1 = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt1);
		
		String txt2 = "We are the so-called \'Vikings\' from the north.";
		System.out.println(txt2);
		
		String txt3 = "We are the so-called \\Vikings\\ from the north.";
		System.out.println(txt3);

		String txt = "We are the so-called (Vikings) from the north.";
		System.out.println(txt);
	}

*/
	
//1111111111111111111111111111111111111111111111111111111111111111
	
/*
	//JAVA MATHS
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num4=16;
		float num5=-5.3f;
		System.out.println(Math.max(num1, num2));  //prints the maximum value
		System.out.println(Math.min(num1, num2));  //prints the minimum value
		System.out.println(Math.sqrt(num4));       //prints the square root
		System.out.println(Math.abs(num5));		   //prints the positive value
		System.out.println(Math.random());         //prints random numbers between 0.0 and 1.0
	}
*/

//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111

/*
	//JAVA BOOLEAN
	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println(y>x);  
		System.out.println(y==x);
	}
*/
	
}
