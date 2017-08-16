package com.viking.task2;

import com.viking.task2.exception.MathNotFoundException;

public class ShelfImpl implements IShelf {

	/**
	 * dynamic array
	 */
	private Book[] elements;
	/**
	 * index of array and choice of method
	 */
	private int index;
	/**
	 * default capacity of dynamic array
	 */
	private final int DEFAULT_CAPACITY = 1;
	
	public ShelfImpl() {
		elements = new Book[DEFAULT_CAPACITY];
	}
	
	public ShelfImpl(int size) {
		elements = new Book[size];
	}
	
	@Override
	public void add(Book e) {
		if (index == elements.length) {
			Book[] tmp = new Book[elements.length + 1];
			System.arraycopy(elements, 0, tmp, 0, index);
			elements = tmp;
		}
		elements[index] = e;
		index++;
	}

	@Override
	public void clear() {
		for (int i = 0; i < elements.length; i++){
			elements[i] = null;
		}
		index = 0;
	}

	@Override
	public boolean remove(Book o) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].equals(o)) {
				elements[i] = null;
				for (int j = i; j < elements.length - 1; j++) {
					elements[j] = elements[j + 1];
				}
				Book[] tmp = new Book[elements.length - 1];
				System.arraycopy(elements, 0, tmp, 0, tmp.length);
				elements = tmp;
				index--;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeByAuthor(String auth){
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].getAuthor().equals(auth)) {
				elements[i] = null;
				for (int j = i; j < elements.length - 1; j++) {
					elements[j] = elements[j + 1];
				}
				Book[] tmp = new Book[elements.length - 1];
				System.arraycopy(elements, 0, tmp, 0, tmp.length);
				elements = tmp;
				index--;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeByName(String nm){
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].getName().equals(nm)) {
				elements[i] = null;
				for (int j = i; j < elements.length - 1; j++) {
					elements[j] = elements[j + 1];
				}
				Book[] tmp = new Book[elements.length - 1];
				System.arraycopy(elements, 0, tmp, 0, tmp.length);
				elements = tmp;
				index--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Book[] findByAuthor(String sequence) throws MathNotFoundException {
		int size=sequence.length();
		int ind=0;
		Book[] res = new Book[10];
		for (int i = 0; i < elements.length; i++) {
			String tmp=elements[i].getAuthor().substring(0, size);
			if(tmp.equals(sequence)){
				res[ind]=elements[i];
				ind++;
			}
		}
		return this.checkArray(res).toArray();
	}
	
	public Book[] findByName(String sequence) throws MathNotFoundException{
		int size=sequence.length();
		int ind=0;
		Book[] res = new Book[10];
		for (int i = 0; i < elements.length; i++) {
			if(elements[i].getName().substring(0, size).equals(sequence)){
				res[ind]=elements[i];
				ind++;
			}
		}
		return this.checkArray(res).toArray();
	}
	
	public ShelfImpl checkArray(Book[] bookArray) throws MathNotFoundException {
		if(bookArray[0]==null) {
			throw new MathNotFoundException("Nothing is find");
		}
		 ShelfImpl tmp=new ShelfImpl();
		 for (int i = 0; i < bookArray.length; i++) {
				if(bookArray[i]!=null){
					tmp.add(bookArray[i]);
				}
		 }
		 return tmp;
	}

	@Override
	public Book[] toArray() {
		return elements;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public boolean contains(Book o) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

}
