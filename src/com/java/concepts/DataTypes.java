package com.java.concepts;

public class DataTypes {

	public static void main(String[] args) {

		/*
		 * Data Types 1. Premitive DataTypes- It takes space in the memory 
		 * a. Boolean-true or false 
		 * b. Numeric- i. character type- char 
		 *             ii. Integral value-
		 * Integers- byte, short, interger & long floating- float & double
		 * character- char
		 */
		

		/*
		 * 1. Byte Size= 1 byte range= -128 to 127
		 */
		byte b = 10;
		byte c = 20;

		byte h = -128;
		//===========================================================================================//
		
		/*
		 * 2. Short Size= 2 bytes= 16 bits range= -32768 to 32767
		 */
		short s = 129;
		short s2 = -129;
		//===========================================================================================//
		
		/*
		 * 3. int size= 4 bytes= 32 bits range=-2147483648 to 2147483647 i.e -2^31 to
		 * 2^31-1
		 */
		int i = 2147483647;
		int i1 = 3423412;
		//===========================================================================================//

		/*
		 * 4. long size= 8 bytes= 64 bits range=-9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807 i.e -2^63 to 2^63-1
		 */
		long l = 2147483;
		long l2 = 3423412;
		long l3 = 2147483648l;
		long phoneNo = 9766039567L; // Not recommended to stores values like phonNo, Aadhar Card, etc
		long lon = 9223372036854775807l;
		// long lon2= 9223372036854775808l; // gives error as value is out of memory
		//===========================================================================================//
		
		/*
		 * 5. float 
		 * size= 4 bytes= 32 bits \
		 * range after decimal-  it can take 7 digits after decimal
		 */
		float f1 = 12.33f;
		float f2 = (float) 12.34;
		float f3 = 100; // 100.00
		float f4= 46.3628819f;
		//===========================================================================================//
		
		/*
		 * 6. double
		 * size= 8 bytes= 64 bits
		 * range after decimal-  it can take 15 digits after decimal
		 * float and double can 
		 */
		double d1 = 12.33;
		double d2 = 12.35;
		double d3 = 100.00; // 100.00
		//int i4= 100.43;  gives error as float/double can save both float and interger values but integer can not
		// save float value
		// long lon2= 9223372036854775808l; // gives error as value is out of memory
		//===========================================================================================//
		
		/*
		 * 7. char
		 * size= 2 bytes= 16 bits
		 * char isalways declared in single quotes
		 * char accepts only single character
		 * Range= a to z, A to Z, 0 to 9, all special characters $, @ etc
		 */
		char c1= 'a';
		char c2= 'T';
		char c3= '7';
		char c4= '#';
		//char c5= '34';  gives error as char only accepts sigle character
		//===========================================================================================//
		
		/*
		 * 8. boolean
		 * Size= ≈ 1 byte= 8 bits
		 *Default value= false
		 */
		boolean b1= true;
		boolean b2= false; 
		//boolean true= false; gives error
		//===========================================================================================//
	
	}

}
