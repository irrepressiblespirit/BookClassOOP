package com.viking.task2;

import com.viking.task2.exception.MathNotFoundException;

public interface IShelf {
	 void add(Book e);
	   void clear();
	   boolean remove(Book o);
	   boolean removeByAuthor(String auth);
	   boolean removeByName(String nm);
	   Book[] findByAuthor(String sequence) throws MathNotFoundException;
	   Book[] findByName(String sequence) throws MathNotFoundException;
	   Book[] toArray();
	   int size();
	   boolean contains(Book o);
}
