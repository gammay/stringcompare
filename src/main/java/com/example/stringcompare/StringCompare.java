package com.example.stringcompare;

import java.util.Arrays;
import java.util.Objects;

public class StringCompare {

	public static void main(String[] args) {
		
		String string1 = "MYTEXT";
		String string2 = "YOURTEXT";
		String string3 = "mytext";
		String string4 = new String("MYTEXT");
		String string5 = new String(string1);
		String string6 = "MYTEXT";
		String string7 = string1;
		String string8 = null;
		String string9 = null;
		String string10 = "";
		String string11 = "";
		
		String[] stringArray1 = { "MYTEXT1", "MYTEXT2", "MYTEXT3" };
		String[] stringArray2 = { "mytext1", "mytext2", "mytext3" };
		String[] stringArray3 = { "MYTEXT1", "MYTEXT2", "MYTEXT3" };
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string2 = \"YOURTEXT\"");
		compareStrings(string1, string2);
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string3 = \"mytext\"");
		compareStrings(string1, string3);
		
		System.out.println("\n" + "Comparing string3 = \"mytext\" and string1 = \"MYTEXT\"");
		compareStrings(string3, string1);
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string4 = new String(\"MYTEXT\")");
		compareStrings(string1, string4);
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string4 = new String(\"MYTEXT\") - string3.intern()");
		compareStrings(string1, string4.intern());
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string5 = new String(string1)");
		compareStrings(string1, string5);
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string5 = new String(string1) - string4.intern()");
		compareStrings(string1, string5.intern());
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string6 = \"MYTEXT\"");
		compareStrings(string1, string6);
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and string7 = string1");
		compareStrings(string1, string7);
		
		System.out.println("\n" + "Comparing string1 = \"MYTEXT\" and \"MY+TEXT\"");
		compareStrings(string1, "MY" + "TEXT");
		
		System.out.println("\n" + "Comparing string8 = null and string9 = null");
		compareStrings(string8, string9);
		
		System.out.println("\n" + "Comparing string10 = \"\" and string11 = \"\"");
		compareStrings(string10, string11);
		
		System.out.println("\n" + "Comparing stringArray1 = \"" + Arrays.toString(stringArray1) + "\" and stringArray2 = \"" + Arrays.toString(stringArray2) + "\"");		
		compareStringArrays(stringArray1, stringArray2);
		
		System.out.println("\n" + "Comparing stringArray1 = \"" + Arrays.toString(stringArray1) + "\" and stringArray3 = \"" + Arrays.toString(stringArray3) + "\"");
		compareStringArrays(stringArray1, stringArray3);
	}

	public static void compareStrings(String firstString, String otherString) {
		try {
			System.out.println(" '" + firstString + "' == '" + otherString + "' : " + (firstString == otherString));
		} catch (Exception e) {
			System.out.println(" '" + firstString + "' == '" + otherString + "' : " + "Exception! " + e);
		}
		
		try {
			System.out.println(" '" + firstString + "' equals '" + otherString + "' : " + (firstString.equals(otherString)));
		} catch (Exception e) {
			System.out.println(" '" + firstString + "' equals '" + otherString + "' : " + "Exception! " + e);
		}
		
		try {
			System.out.println(" '" + firstString + "' equalsIgnoreCase '" + otherString + "' : " + (firstString.equalsIgnoreCase(otherString)));
		} catch (Exception e) {
			System.out.println(" '" + firstString + "' equalsIgnoreCase '" + otherString + "' : " + "Exception! " + e);
		}
				
		try {
			System.out.println(" '" + firstString + "' compareTo '" + otherString + "' : " + (firstString.compareTo(otherString)));
		} catch (Exception e) {
			System.out.println(" '" + firstString + "' compareTo '" + otherString + "' : " + "Exception! " + e);
		}
		
		try {
			System.out.println(" '" + firstString + "' compareToIgnoreCase '" + otherString + "' : " + (firstString.compareToIgnoreCase(otherString)));
		} catch (Exception e) {
			System.out.println(" '" + firstString + "' compareToIgnoreCase '" + otherString + "' : " + "Exception! " + e);
		}
		
		try {
			System.out.println(" " + "Objects.equals('" + firstString + "', '" + otherString + "') : " + (Objects.equals(firstString, otherString)));
		} catch (Exception e) {
			System.out.println(" " + "Objects.equals('" + firstString + "', '" + otherString + "') : " + "Exception! " + e);
		}
		
		try {
			System.out.println(" " + "Objects.compare('" + firstString + "', '" + otherString + ", new StringComparator()" + "') : " + (Objects.compare(firstString, otherString, new StringComparator())));
		} catch (Exception e) {
			System.out.println(" " + "Objects.compare('" + firstString + "', '" + otherString + ", new StringComparator()" + "') : " + "Exception! " + e);
		}
		
		try {
			System.out.println(" " + "Objects.compare('" + firstString + "', '" + otherString + ", new StringIgnoreCaseComparator()" + "') : " + (Objects.compare(firstString, otherString, new StringIgnoreCaseComparator())));
		} catch (Exception e) {
			System.out.println(" " + "Objects.compare('" + firstString + "', '" + otherString + ", new StringIgnoreCaseComparator()" + "') : " + "Exception! " + e);
		}
	}
	
	public static void compareStringArrays(String[] firstStringArray, String[] otherStringArray) {
		try {
			System.out.println(" '" + Arrays.toString(firstStringArray) + "' == '" + Arrays.toString(otherStringArray) + "' : " + (firstStringArray == otherStringArray));
		} catch (Exception e) {
			System.out.println(" '" + Arrays.toString(firstStringArray) + "' == '" + Arrays.toString(otherStringArray) + "' : " + "Exception!");
		}
		
		try {
			System.out.println(" '" + Arrays.toString(firstStringArray) + "' equals '" + Arrays.toString(otherStringArray) + "' : " + (firstStringArray.equals(otherStringArray)));
		} catch (Exception e) {
			System.out.println(" '" + Arrays.toString(firstStringArray) + "' equals '" + Arrays.toString(otherStringArray) + "' : " + "Exception!");
		}
		
		try {
			System.out.println(" " + "Objects.equals('" + Arrays.toString(firstStringArray) + "', '" + Arrays.toString(otherStringArray) + "') : " + (Objects.equals(firstStringArray, otherStringArray)));
		} catch (Exception e) {
			System.out.println(" " + "Objects.equals('" + Arrays.toString(firstStringArray) + "', '" + Arrays.toString(otherStringArray) + "') : " + "Exception!");
		}
		
		try {
			System.out.println(" " + "Objects.deepEquals('" + Arrays.toString(firstStringArray) + "', '" + Arrays.toString(otherStringArray) + "') : " + (Objects.deepEquals(firstStringArray, otherStringArray)));
		} catch (Exception e) {
			System.out.println(" " + "Objects.deepEquals('" + Arrays.toString(firstStringArray) + "', '" + Arrays.toString(otherStringArray) + "') : " + "Exception!");
		}		
	}
}
