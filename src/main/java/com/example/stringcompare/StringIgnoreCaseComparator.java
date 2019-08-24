package com.example.stringcompare;

import java.util.Comparator;

public class StringIgnoreCaseComparator implements Comparator<String> {

	public int compare(String string1, String string2) {
		return string1.compareToIgnoreCase(string2);
	}
}
