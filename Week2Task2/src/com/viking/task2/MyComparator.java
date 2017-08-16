package com.viking.task2;

import java.util.Comparator;

public class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		String name1=o1.getName();
		String name2=o2.getName();
		return name1.compareTo(name2);
	}

}
